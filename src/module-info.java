module kryptonbutterfly.Cache
{
	exports kryptonbutterfly.cache;
	exports kryptonbutterfly.cache.concurrent;
	
	requires transitive kryptonbutterfly.Collections;
	requires kryptonbutterfly.Monads;
	requires transitive kryptonbutterfly.bounded;
}