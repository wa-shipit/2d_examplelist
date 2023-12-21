package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Micro2ndDataController {

	@RequestMapping(path = "/receive/{param1}", method = RequestMethod.GET)
	public String first(@PathVariable String param1) {

		return "あなたは前回" + param1 + "って打ったね";
	}

	/*
	 * 演習問題用
	 */
	//	@RequestMapping(path = "/receiveenshu/{?????}/{?????}", method = RequestMethod.GET)
	//	public String en(@PathVariable String ?????, @PathVariable String ????) {
	//
	//		return paramEnshu1 + paramEnshu2;
	//	}

	/*
	 * 応用問題用
	 */
	//	@RequestMapping(path = "/receiveouyou/{?????}/{?????}/{?????}", method = RequestMethod.GET)
	//	public String ou(???? ???? ????, HttpSession ????) {
	//
	//		//前回の入力をセッションから取得
	//
	//		return "あなたが前回打ったのは" +  + "で今回は" + ;
	//	}

	/*
	 * 超応用問題用
	 * 
	 * 画面から入力された値でデータベースに対して検索をかけてね。
	 * 検索対象のテーブルは「spitem」テーブルとし、
	 * 画面から入力された値でitem_name列に検索をかける。
	 * 検索した結果が1件以上(resultList.size())が1件以上であれば「検索成功」とsysoutする事。
	 * 
	 * 尚、htmlの入力欄を増やす使いまわすはお任せします。URL、変数名等もお任せします。
	 * このControllerの「public class」の下の行に「@Autowired JdbcTemplate jdbcTemplate;」の記述を忘れずに。
	 * return する文字列は「超応用問題クリア」とする事 
	 */
	//		@RequestMapping(path = "/receivecho/?????", method = RequestMethod.GET)
	//		public String chou(????) {
	//	
	//			return "";
	//		}
}
