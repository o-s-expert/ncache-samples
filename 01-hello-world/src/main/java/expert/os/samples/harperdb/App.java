
package expert.os.samples.harperdb;


import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.spi.CachingProvider;

public class App {

    public static void main(String[] args) {
        // Create an instance of JCache's caching provider to get JCacheManager's instance by NCache
        CachingProvider provider = Caching.getCachingProvider();
        CacheManager manager = provider.getCacheManager();
        // Get a cache from manager via its string name.
        javax.cache.Cache<Object, Object> jCache = manager.getCache("demoCache");
        jCache.put("key", "value");;

    }

    private App() {
    }


}
