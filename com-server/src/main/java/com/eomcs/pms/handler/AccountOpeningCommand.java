package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import com.eomcs.pms.domain.Bank;
import com.eomcs.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다.
public class AccountOpeningCommand implements Command {

  List<Bank> accountList;

  public AccountOpeningCommand(List<Bank> list) {
    accountList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
  	  out.println("   ＿＿＿＿＿＿＿＿＿＿＿＿＿");
  	  out.println("           계좌 등록    ");
  	  out.println("   ￣￣￣￣￣￣￣￣￣￣￣￣￣");

      Bank account = new Bank();
      account.setNo(Prompt.inputInt("번호? ", out, in));
      int[] array = new int[14];
      for (int i = 1; i < 14 ; i++) {
   	   array[i] = (int)((Math.random()*100)/10);;
   	   Thread.sleep(100);
      }
      System.out.println(Arrays.toString(array));
      System.out.printf("%s%s%s-%s%s%s%s%s%s-%s%s%s%s",
   		   array[0],
   		   	array[1],
   			array[2],
   			array[3],
   			array[4],
   			array[5],
   			array[6],
   			array[7],
   			array[8],
   		   array[9],
   			array[10],
   			array[11],
   			array[12]);
      
      //account.setAno(Prompt.inputString("계좌번호?", out, in));
      out.printf("계좌번호는 -> %s입니다 .",Arrays.toString(array));
      account.setName(Prompt.inputString("이름? ", out, in));
      account.setBalance(Prompt.inputInt("잔고? ", out, in));

      accountList.add(account);


      out.println("\t✿ 계좌 등록 완료 ✿");


    } catch(Exception e) {
      out.printf("\t작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
}