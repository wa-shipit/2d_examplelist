package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class HttpSessionOuyouController {
	@RequestMapping(path = "/sessionouyoua", method = RequestMethod.GET)
	public String a() {
		return "sessionouyoua";
	}

	@RequestMapping(path = "/sessionouyoua", method = RequestMethod.POST)
	public String ap(String ouyoua, HttpSession session) {
		/*
		 * <演習問題①>
		 * 画面から入力された変数「ouyoua」を
		 * セッションに「sessionpara」という名前で保存する。
		 */

		//セッションに格納（保存）

		return "sessionouyoub";
	}

	@RequestMapping(path = "/sessionouyoub", method = RequestMethod.POST)
	public String bp(String ouyoub, HttpSession session) {
		/*
		 * <演習問題②>
		 * セッションから演習問題①で保存した値を取り出し、
		 * 画面から入力された変数「ouyoub」と結合した上で
		 * セッションに「sessionpara」という名前で保存する。
		 */
		String x = (String) session.getAttribute("????");

		//セッションへ格納

		return "sessionouyouc";
	}

	@RequestMapping(path = "/sessionouyouc", method = RequestMethod.POST)
	public String cp(String ouyouc, HttpSession session) {
		/*
		 * <演習問題③>
		 * セッションから演習問題②で保存した値を取り出し、
		 * 画面から入力された変数「ouyouc」と結合した上で
		 * セッションに「sessionpara」という名前で保存する。
		 */
		String x = (String) session.getAttribute("????");

		//セッションへ格納

		return "sessionouyoud";
	}

	@RequestMapping(path = "/sessionouyoud", method = RequestMethod.GET)
	public String d(HttpSession session) {
		/*
		 * <演習問題④>
		 * セッションから演習問題③で保存した値を削除しなさい。
		 */

		//セッションから削除

		return "sessionouyoud";
	}
}