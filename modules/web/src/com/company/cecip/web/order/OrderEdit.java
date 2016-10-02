package com.company.cecip.web.order;

import com.company.cecip.entity.OrderLine;
import com.haulmont.bali.util.ParamsMap;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.cecip.entity.Order;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.util.UUID;

public class OrderEdit extends AbstractEditor<Order> {

    @Inject
    Datasource<Order> orderDs;

    @Inject
    protected CollectionDatasource<OrderLine, UUID> orderLinesDs;

    public void orderLinesEdit() {
        openWindow("order-lines-dialog", WindowManager.OpenType.DIALOG, ParamsMap.of("orderLinesDs", orderLinesDs));
    }
}