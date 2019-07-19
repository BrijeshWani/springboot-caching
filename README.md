# springboot-caching
This project explains method level caching of springboot.

Caching can be enabled in springboot using below annotations

## @EnableCaching
This annotation need to used at springboot application class.

## @Cacheable("tableCache")
This is used on method whose results needs to be cached.


## Controlling cache
If you want your application to use only specific cache then add property as below,

```
spring.cache.cache-names: tableCache
```

If you use any other cache name in application then it will throw runtime exception.

## Disable cache
Caching can be completely disable using,

```
spring.cache.type: none
```