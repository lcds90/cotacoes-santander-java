package com.project.santanderbootcamp.exceptions;

import com.project.santanderbootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException {
    public NotFoundException(){
        super(MessageUtils.STOCK_NOT_FOUND);
    }
}
