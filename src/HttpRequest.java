/*
 * 
 * import org.springframework.http.HttpMethod;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * public class HttpRequest {
 * 
 * private String uri; private HttpMethod method; private Map<String, String>
 * headers; private Map<String, String> queries; private String payload;
 * 
 * public HttpRequest() {}
 * 
 * public HttpRequest(String uri, HttpMethod method, Map<String, String>
 * headers, Map<String, String> queries, String payload) { this.uri = uri;
 * this.method = method; this.headers = headers; this.queries = queries;
 * this.payload = payload; }
 * 
 * public String getUri() { return uri; }
 * 
 * public void setUri(String uri) { this.uri = uri; }
 * 
 * public HttpMethod getMethod() { return method; }
 * 
 * public void setMethod(HttpMethod method) { this.method = method; }
 * 
 * public Map<String, String> getHeaders() { return headers; }
 * 
 * public void setHeaders(Map<String, String> headers) { this.headers = headers;
 * }
 * 
 * public void addHeader(String name, String value) { if(this.headers == null) {
 * this.headers = new HashMap<>(); } this.headers.put(name, value); }
 * 
 * public Map<String, String> getQueries() { return queries; }
 * 
 * public void setQueries(Map<String, String> queries) { this.queries = queries;
 * }
 * 
 * public void addQuery(String name, String value) { if(this.queries == null) {
 * this.queries = new HashMap<>(); } this.queries.put(name, value); }
 * 
 * public String getPayload() { return payload; }
 * 
 * public void setPayload(String payload) { this.payload = payload; } }
 */