package com.doosan.test.prac4;

@Slf4j
@Controller
public class CustomErrorController implements ErrorController {

	private static final String ERROR_PATH_DEFAULT = "/error";
	private static final String ERROR_PATH_4xx = "/error/400";
	private static final String ERROR_PATH_5xx = "/error/500";

	@RequestMapping(value = ERROR_PATH_DEFAULT)
	public ModelAndView defaultError(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		log.error("[Error - Unknown] Requester IP/Hostname: " + request.getRemoteAddr() + "/" + request.getRemoteHost() + ", Requested URI: " + request.getAttribute("javax.servlet.forward.servlet_path"));

		mav.addObject("headTitle", "");
		mav.addObject("errorTitle", "");
		mav.addObject("errorDetail", "");
		mav.setViewName("error/error");

		return mav;
	}

	@RequestMapping(value = ERROR_PATH_4xx)
	public ModelAndView clientError(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		log.error("[Error - 400] Requester IP/Hostname: " + request.getRemoteAddr() + "/" + request.getRemoteHost() + ", Requested URI: " + request.getAttribute("javax.servlet.forward.servlet_path"));

		mav.addObject("headTitle", "");
		mav.addObject("errorTitle", "");
		mav.addObject("errorDetail", "");
		mav.setViewName("error/error");

		return mav;
	}

	@RequestMapping(value = ERROR_PATH_5xx)
	public ModelAndView serverError(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		log.error("[Error - 500] Requester IP/Hostname: " + request.getRemoteAddr() + "/" + request.getRemoteHost() + ", Requested URI: " + request.getAttribute("javax.servlet.forward.servlet_path"));

		mav.addObject("headTitle", "");
		mav.addObject("errorTitle", "");
		mav.addObject("errorDetail", "");
		mav.setViewName("error/error");

		return mav;
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH_DEFAULT;
	}

}
