package com.example.member.exception;

public class AlreadyWithdrawException extends IllegalArgumentException{
    public AlreadyWithdrawException(Long id) {
        super(id + " already withdraw");
    }
}