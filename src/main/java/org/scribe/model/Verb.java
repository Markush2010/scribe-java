package org.scribe.model;

/**
 * An enumeration containing the most common HTTP Verbs.
 * 
 * As defined by the <a
 * href="http://tools.ietf.org/html/rfc2616.html#section-5.1.1">RFC 2616 in
 * section 5.1.1</a>. <code>CONNECT</code> and <code>TRACE</code> are ignored.
 * 
 * @author Pablo Fernandez, Markus Holtermann
 */
public enum Verb {
	GET, POST, PUT, DELETE, HEAD, OPTIONS;
}
