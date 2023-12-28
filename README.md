# tinyCache
A module containing several cache implementations.

Class                        | Description
:--------------------------  | :----------
@Cache                       | this annotation is used to mark functions to be modified to use the specified cache ([ByteCode manipulator](https://github.com/tinycodecrank/CacheBuilder) to process this annotation).
ICache                       | The interface all supplied cache Classes implement.
ExpandingCache               | A cache implementation that expands without limits.
FIFOCache                    | A cache that evicts the elements when the capacity has been reached ([FIFO](https://en.wikipedia.org/wiki/Cache_replacement_policies#First_in_first_out_(FIFO))).
LRUCache                     | A cache that evicts the elements when the capacity has been reached ([LRU](https://en.wikipedia.org/wiki/Cache_replacement_policies#Least_recently_used_(LRU))).
SingleElementCache           | A cache containing at most one element.
ConcurrentExpandingCache     | A synchronized version of ExpandingCache.
ConcurrentFIFOCache          | A synchronized version of FIFOCache.
ConcurrentLRUCache           | A synchronized version of LRUCache.
ConcurrentSingleElementCache | A synchromized version of SingleElementCache.

## Getting the latest release

```xml
<repository>
  <id>github</id>
  <url>https://maven.pkg.github.com/tinycodecrank/maven-repo</url>
</repository>
```

```xml
<dependency>
  <groupId>de.tinycodecrank</groupId>
  <artifactId>tiny_cache</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Download
java version | library version | Download
:----------: | :-------------: | :-------
18+          | 1.0.0           | [**tinyCache.jar**](https://github.com/tinycodecrank/tinyCache/releases/download/v1.0.0/tinyCache.jar)

