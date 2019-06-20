package com.api.monese.service;

import com.api.monese.dao.entities.Account;
import com.api.monese.model.SuccessResponse;
import com.api.monese.model.TransactionRequest;
import com.api.monese.util.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Below is the service implementation class for Account Operations.
 */
@Service
public class AccountService {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private AccountDao accountDao;

    /**
     * Method is resposible for handling service logic for transfer request.
     * @param transactionRequest
     * @return
     * @throws ApplicationException
     */
    public SuccessResponse doTransfer(TransactionRequest transactionRequest) throws ApplicationException {
        return transactionService.doTransfer(transactionRequest);
    }

    /**
     * below method is responsible for handling service logic for retrieving account statement details.
     * @param accountNo
     * @return
     * @throws ApplicationException
     */
    public Account getAccountStatement(String accountNo) throws ApplicationException {
        return accountDao.getAccountStatement(accountNo);
    }
}
