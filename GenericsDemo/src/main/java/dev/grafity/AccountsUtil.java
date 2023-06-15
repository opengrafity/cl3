package dev.grafity;

import java.util.List;

public class AccountsUtil {
    public static <T extends Account> void  print(List<T> accounts){
        for(Account account:accounts){
            System.out.printf("Account[id=%d, name=%s, balance=%f \n]",
                    account.getId(), account.getName(), account.getBalance());

        }
    }

    public static void display(List<?> objs){
        for(Object obj:objs){
            System.out.println(obj.toString());
        }
    }
}
