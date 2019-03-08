package nl.tue.base.core.exception;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class TueExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleHttpRequestMethodNotSupported(ex, headers, status, request).toString());
        return super.handleHttpRequestMethodNotSupported(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleHttpMediaTypeNotSupported(ex, headers, status, request).toString());
        return super.handleHttpMediaTypeNotSupported(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotAcceptable(HttpMediaTypeNotAcceptableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleHttpMediaTypeNotAcceptable(ex, headers, status, request).toString());
        return super.handleHttpMediaTypeNotAcceptable(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleMissingPathVariable(ex, headers, status, request).toString());
        return super.handleMissingPathVariable(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleMissingServletRequestParameter(ex, headers, status, request).toString());
        return super.handleMissingServletRequestParameter(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleServletRequestBindingException(ServletRequestBindingException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleServletRequestBindingException(ex, headers, status, request).toString());
        return super.handleServletRequestBindingException(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleConversionNotSupported(ConversionNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleConversionNotSupported(ex, headers, status, request).toString());
        return super.handleConversionNotSupported(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleTypeMismatch(ex, headers, status, request).toString());
        return super.handleTypeMismatch(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleHttpMessageNotReadable(ex, headers, status, request).toString());
        return super.handleHttpMessageNotReadable(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotWritable(HttpMessageNotWritableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleHttpMessageNotWritable(ex, headers, status, request).toString());
        return super.handleHttpMessageNotWritable(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleMethodArgumentNotValid(ex, headers, status, request).toString());
        return super.handleMethodArgumentNotValid(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestPart(MissingServletRequestPartException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleMissingServletRequestPart(ex, headers, status, request).toString());
        return super.handleMissingServletRequestPart(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleBindException(BindException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleBindException(ex, headers, status, request).toString());
        return super.handleBindException(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleNoHandlerFoundException(ex, headers, status, request).toString());
        return super.handleNoHandlerFoundException(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleAsyncRequestTimeoutException(AsyncRequestTimeoutException ex, HttpHeaders headers, HttpStatus status, WebRequest webRequest) {
        logger.error(super.handleAsyncRequestTimeoutException(ex, headers, status, webRequest).toString());
        return super.handleAsyncRequestTimeoutException(ex, headers, status, webRequest);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error(super.handleExceptionInternal(ex, body, headers, status, request).toString());
        return super.handleExceptionInternal(ex, body, headers, status, request);
    }

    @ExceptionHandler(javax.persistence.EntityNotFoundException.class)
    protected ResponseEntity<Object> handleEntityNotFound(javax.persistence.EntityNotFoundException ex) {
        logger.info(ex.getMessage());
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(DataIntegrityViolationException.class)
    protected ResponseEntity<Object> handleDataIntegrityViolation(DataIntegrityViolationException ex,
                                                                  WebRequest request) {
        if (ex.getCause() instanceof ConstraintViolationException) {
            logger.error("Database error: " + ex.getMessage());
            return new ResponseEntity(HttpStatus.CONFLICT);
        }
        logger.error(ex.getMessage());
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    protected ResponseEntity<String> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException ex,
                                                                      WebRequest request) {
        logger.error("Method Argument Type Mismatch Exception :" + ex.getMessage());
        return new ResponseEntity<String>(String.format("The parameter '%s' of value '%s' could not be converted to type '%s'", ex.getName(), ex.getValue(), ex.getRequiredType().getSimpleName()), HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(CanNotDeleteEntityException.class)
    protected ResponseEntity<String> handleCanNotDeleteEntityException(CanNotDeleteEntityException ex,
                                                                      WebRequest request) {
        logger.error("Can not delete entity  :" + ex.getMessage());
        return new ResponseEntity<String>(String.format("Can not delete entity :", ex.getMessage()), HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(CanNotInsertEntityException.class)
    protected ResponseEntity<String> handleCanNotInsertEntityException(CanNotInsertEntityException ex,
                                                                       WebRequest request) {
        logger.error("Can not insert entity :" + ex.getMessage());
        return new ResponseEntity<String>("Can not insert entity :" + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CanNotUpdateEntityException.class)
    protected ResponseEntity<String> handleCanNotUpdateEntityException(CanNotUpdateEntityException ex,
                                                                       WebRequest request) {
        logger.error("Can not update entity :" + ex.getMessage());
        return new ResponseEntity<String>("Can not update entity :" + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(GeneralServiceException.class)
    protected ResponseEntity<String> handleGeneralServiceException(GeneralServiceException ex,
                                                                       WebRequest request) {
        logger.error("UnExcepted situation :" + ex.getMessage());
        return new ResponseEntity<String>("UnExcepted situation :" + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
