package com.quick.demo.rest.manager;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.quick.demo.rest.enums.ResponseCodesEnum;
import com.quick.demo.rest.request.QuickDemoRequest;
import com.quick.demo.rest.response.QuickDemoResponse;

/**
 * This class handles the global execution of RestManagers and sets the response
 * <br>
 * code in case of success or some error.
 * 
 * @author RGimenez
 *
 * @param <A>
 *            EpointsRequest
 * @param <B>
 *            EpointsResponse
 */
public abstract class ParentManager<A extends QuickDemoRequest, B extends QuickDemoResponse> {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Global handles of execution of manager.
	 * 
	 * @param request
	 * @return
	 */
	public B startManager(A request) {
		B response = getInstanceResponse();
		try {
			response = execute(request, response);
			if (response.getError() == null || response.getError().equals("")) {
				setCodeResponse(response, ResponseCodesEnum.SUCCESS);
			}
		} catch (Exception ex) {
			logger.error("Error en manager: ");
			logger.error(Calendar.getInstance().getTime().toString());
			System.out.println(ex);
			setCodeResponse(response, ResponseCodesEnum.GENERIC_ERROR);
		}
		return response;
	}

	protected abstract B getInstanceResponse();

	protected abstract B execute(A request, B response) throws Exception;

	/**
	 * Charge a response code in the response.
	 * 
	 * @param response
	 * @param codeEnum
	 */
	protected void setCodeResponse(B response, ResponseCodesEnum responseCodeEnum) {
		response.setError(responseCodeEnum.code());
		response.setMessage(responseCodeEnum.message());
	}

}
