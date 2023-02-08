import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

private const val APY_KEY = "wSa9ePXknzfhcjxatgdpzQfzmJsZD3AxOc9LQIKY"

class Interceptor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()
        request = request.newBuilder().addHeader("X-Api-Key", APY_KEY).build()
        return chain.proceed(request)
    }
}