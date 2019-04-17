package com.cput.ac.za.factory;

import com.cput.ac.za.domain.humans.Account;

public class AccountFactory
{
    public static Account getAccount(int accountId, int empNumber, String username, String password, String role)
    {
        return new Account.Builder().accountId(accountId)
                .empNumber(empNumber)
                .username(username)
                .password(password)
                .role(role)
                .build();

    }
}
