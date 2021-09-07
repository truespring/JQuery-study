package com.doosan.test.prac4;

public class ErrorHandler  implements ErrorController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final String ERROR_PATH_DEFAULT = "/error";
	private static final String ERROR_PATH_4xx = "/error/400";
	private static final String ERROR_PATH_5xx = "/error/500";

	@RequestMapping(value = ERROR_PATH_DEFAULT)
	public ModelAndView defaultError(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		logger.error("[Error - Unknown] Requester IP/Hostname: " + request.getRemoteAddr() + "/" + request.getRemoteHost() + ", Requested URI: " + request.getAttribute("javax.servlet.forward.servlet_path"));

		mav.addObject("headTitle", "pvi18n.000313");
		mav.addObject("errorTitle", "pvi18n.000313");
		mav.addObject("errorDetail", "pvi18n.000314");
		mav.setViewName("error/error");

		return mav;
	}

	@RequestMapping(value = ERROR_PATH_4xx)
	public ModelAndView clientError(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		logger.error("[Error - 400] Requester IP/Hostname: " + request.getRemoteAddr() + "/" + request.getRemoteHost() + ", Requested URI: " + request.getAttribute("javax.servlet.forward.servlet_path"));

		mav.addObject("headTitle", "pvi18n.000315");
		mav.addObject("errorTitle", "pvi18n.000315");
		mav.addObject("errorDetail", "pvi18n.000316");
		mav.setViewName("error/error");

		return mav;
	}

	@RequestMapping(value = ERROR_PATH_5xx)
	public ModelAndView serverError(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		logger.error("[Error - 500] Requester IP/Hostname: " + request.getRemoteAddr() + "/" + request.getRemoteHost() + ", Requested URI: " + request.getAttribute("javax.servlet.forward.servlet_path"));

		mav.addObject("headTitle", "pvi18n.000317");
		mav.addObject("errorTitle", "pvi18n.000317");
		mav.addObject("errorDetail", "pvi18n.000318");
		mav.setViewName("error/error");

		return mav;
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH_DEFAULT;
	}

}
