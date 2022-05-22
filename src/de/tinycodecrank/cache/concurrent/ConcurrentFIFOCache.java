package de.tinycodecrank.cache.concurrent;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;

import de.tinycodecrank.cache.CacheKey;
import de.tinycodecrank.cache.ICache;
import de.tinycodecrank.collections.CyclicBuffer;

public class ConcurrentFIFOCache<Key, Value> implements ICache<Key, Value>
{
	private final HashMap<CacheKey<Key>, Value>	cache	= new HashMap<>();
	private final CyclicBuffer<CacheKey<Key>>	evictionBuffer;
	private final Function<Key, Value>			function;
	
	@SuppressWarnings("deprecation")
	public ConcurrentFIFOCache(Function<Key, Value> function, int capacity)
	{
		this.function		= function;
		this.evictionBuffer	= new CyclicBuffer<>(capacity, this.cache::remove);
	}
	
	@SuppressWarnings("deprecation")
	public ConcurrentFIFOCache(Function<Key, Value> function, int capacity, Consumer<Key> evictionListener)
	{
		this.function		= function;
		this.evictionBuffer	= new CyclicBuffer<>(capacity, key ->
							{
								cache.remove(key);
								evictionListener.accept(key.key);
							});
	}
	
	@Override
	public Value get(Key key)
	{
		CacheKey<Key> cKey = new CacheKey<>(key);
		synchronized (cache)
		{
			if (contains(cKey))
			{
				Value value = peak(cKey);
				return value;
			}
			else
			{
				Value value = this.function.apply(key);
				this.cache.put(cKey, value);
				evictionBuffer.push(cKey);
				return value;
			}
		}
	}
	
	@Override
	public Value peak(Key key)
	{
		return peak(new CacheKey<>(key));
	}
	
	private Value peak(CacheKey<Key> key)
	{
		synchronized (cache)
		{
			return this.cache.get(key);
		}
	}
	
	@Override
	public boolean contains(Key key)
	{
		return contains(new CacheKey<>(key));
	}
	
	private boolean contains(CacheKey<Key> key)
	{
		synchronized (cache)
		{
			return this.cache.containsKey(key);
		}
	}
	
	@Override
	public void clear()
	{
		synchronized (cache)
		{
			cache.clear();
			evictionBuffer.clear();
		}
	}
	
	@Override
	public int size()
	{
		return evictionBuffer.size();
	}
	
	@Override
	public void close()
	{
		clear();
	}
}