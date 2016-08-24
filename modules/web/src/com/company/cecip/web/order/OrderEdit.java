package com.company.cecip.web.order;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.cecip.entity.Order;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;

public class OrderEdit extends AbstractEditor<Order> {

    @Inject
    Datasource<Order> orderDs;

    public void orderLinesEdit() {
        openEditor("cecip$Order-OrderLine.edit", getItem(), WindowManager.OpenType.DIALOG, orderDs);
    }
}