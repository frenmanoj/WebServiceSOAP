package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import presentation.SortingApp;

public class SortServlet extends HttpServlet {

	private static final long serialVersionUID = 8103342601196188319L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// reading the user input
		String inputArray = request.getParameter("input-array");

		String[] arr = inputArray.split("\\ ");

		int[] inputArr = new int[arr.length];

		int i = 0;
		for (String elem : arr) {

			inputArr[i++] = Integer.parseInt(elem);
		}

		SortingApp webService = new SortingApp();

		int[] sortedArr = webService.sort(inputArr);

		request.setAttribute("inputArray", inputArr);
		request.setAttribute("sortedArray", sortedArr);
		request.getRequestDispatcher("/").forward(request, response);
	}
}