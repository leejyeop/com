package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;

import com.eomcs.pms.domain.Bank;
import com.eomcs.util.Prompt;

public class AccountDeleteCommand implements Command {

  List<Bank> accountList;

  public AccountDeleteCommand(List<Bank> bankList) {
    accountList = bankList;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
  	  out.println("   ＿＿＿＿＿＿＿＿＿＿＿＿＿");
  	  out.println("           계좌 삭제    ");
  	  out.println("   ￣￣￣￣￣￣￣￣￣￣￣￣￣");
      int no = Prompt.inputInt("번호? ", out, in);
      int index = indexOf(no);

      if (index == -1) {

        out.println("\t해당 번호의 계좌가 존재하지 않습니다.");

        return;
      }

      String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {

        out.println("\t✿ 계좌 삭제 취소✿");
        out.println();


        return;
      }

      accountList.remove(index);

      out.println("\t계좌 삭제 완료");


    } catch (Exception e) {
      out.printf("\t작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }

  private int indexOf(int no) {
    for (int i = 0; i < accountList.size(); i++) {
    	Bank account = accountList.get(i);
      if (account.getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}