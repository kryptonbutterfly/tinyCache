<img align="left" width="82" src="https://raw.githubusercontent.com/kryptonbutterfly/tinyCache/master/icon.svg">

# tinyCache [![Maven Package](https://github.com/kryptonbutterfly/tinyCache/actions/workflows/maven-publish.yml/badge.svg)](https://github.com/kryptonbutterfly/tinyCache/actions/workflows/maven-publish.yml)

A module containing several cache implementations.

Class                        | Description
:--------------------------  | :----------
@Cache                       | this annotation is used to mark functions to be modified to use the specified cache ([ByteCode manipulator](https://github.com/kryptonbutterfly/CacheBuilder) to process this annotation).
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
  <url>https://maven.pkg.github.com/kryptonbutterfly/maven-repo</url>
</repository>
```

```xml
<dependency>
  <groupId>kryptonbutterfly</groupId>
  <artifactId>tiny_cache</artifactId>
  <version>2.0.1</version>
</dependency>
```

## Download
java version | library version | Download
:----------: | :-------------: | :-------
18+          | 2.0.1           | [**tiny_cache-2.0.1.jar**](https://github.com/kryptonbutterfly/tinyCache/releases/download/v2.0.1/tiny_cache-2.0.1.jar)
18+          | 2.0.0           | [**tiny_cache-2.0.0.jar**](https://github-registry-files.githubusercontent.com/731108692/4cb5d080-b665-11ee-9c9d-546137347dc4?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240118%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240118T235505Z&X-Amz-Expires=300&X-Amz-Signature=19949762a305d7a7de308ee39d0f39bd270504466fa3b6df40a4fdb989169986&X-Amz-SignedHeaders=host&actor_id=0&key_id=0&repo_id=731108692&response-content-disposition=filename%3Dtiny_cache-2.0.0.jar&response-content-type=application%2Foctet-stream)
18+          | 1.0.0           | [**tinyCache.jar**](https://github.com/kryptonbutterfly/tinyCache/releases/download/v1.0.0/tinyCache.jar)

