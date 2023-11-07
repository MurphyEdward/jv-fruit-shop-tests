package operation.impl;

import db.Storage;
import model.FruitTransaction;
import operation.OperationHandler;

public class SupplyOperationHandlerImpl implements OperationHandler {
    @Override
    public void accept(FruitTransaction fruitTransaction) {
        Storage.addFruit(fruitTransaction.fruit(), fruitTransaction.amount());
    }
}
