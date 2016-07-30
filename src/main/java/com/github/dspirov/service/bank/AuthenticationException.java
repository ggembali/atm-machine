package com.github.dspirov.service.bank;

/**
 * Exception that authentication cannot be done properly. Means that there are no problems with authentication, like
 * bad pin or something, but that system itself cannot do authentication.
 *
 * Created by dspirov on 30/07/16.
 */
public class AuthenticationException extends Exception {
}
