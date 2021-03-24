/*
 * package com.society.core.vms;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.Filter; import javax.servlet.FilterChain; import
 * javax.servlet.FilterConfig; import javax.servlet.ServletException; import
 * javax.servlet.ServletRequest; import javax.servlet.ServletResponse; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.core.Ordered; import
 * org.springframework.core.annotation.Order; import
 * org.springframework.stereotype.Component;
 * 
 * @Component
 * 
 * @Order(Ordered.HIGHEST_PRECEDENCE) class CorsFilter implements Filter {
 * 
 * private static final Logger LOGGER =
 * LoggerFactory.getLogger(CorsFilter.class);
 * 
 * @Override public void doFilter(ServletRequest req, ServletResponse res,
 * FilterChain chain) throws IOException, ServletException { HttpServletResponse
 * response = (HttpServletResponse) res;
 * response.setHeader("Access-Control-Allow-Origin", "*");
 * response.setHeader("Access-Control-Allow-Methods",
 * "POST, GET, OPTIONS, DELETE ,PUT");
 * response.setHeader("Access-Control-Max-Age", "3600");
 * response.setHeader("Access-Control-Allow-Headers",
 * "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization"
 * ); response.setHeader("Access-Control-Expose-Header", "*");
 * chain.doFilter(req, res); }
 * 
 * // (non-Javadoc)
 * 
 * // @see javax.servlet.Filter#destroy()
 * 
 * @Override public void destroy() {
 * 
 * LOGGER.debug("CorsFilter.destroy() Executed."); }
 * 
 * // (non-Javadoc)
 * 
 * // @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
 * 
 * @Override public void init(FilterConfig arg0) throws ServletException {
 * 
 * LOGGER.debug("CorsFilter.init() Executed."); }
 * 
 * }
 */