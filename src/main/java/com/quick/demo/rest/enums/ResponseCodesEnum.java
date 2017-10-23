package com.quick.demo.rest.enums;

/**
 * Enum with response codes for the responses. 
 * 
 */
public enum ResponseCodesEnum {
	
	/** Invalid Request */
	INVALID_REQUEST(-1,"Invalid Request"),
	/** success */
	SUCCESS(0,"success"),
	/** An error has occurred try later or contact the administrator */
	GENERIC_ERROR(1,"An error has occurred try later or contact the administrator");
	/** invalid userAlias or aliasType */
	
	private Integer code;
	private String message;
	
	ResponseCodesEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
	
	/**
	 * gets the code of response.
	 * @return code
	 */
    public String code() {
    	return code.toString();
	}
    
    /**
     * gets a description for error code.
     * @return messages
     */
    public String message(){
    	return message;
    }
    
}