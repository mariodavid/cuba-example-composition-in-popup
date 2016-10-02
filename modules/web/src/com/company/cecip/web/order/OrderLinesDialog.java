package com.company.cecip.web.order;

import com.company.cecip.entity.OrderLine;
import com.haulmont.cuba.gui.WindowParam;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;
import com.haulmont.cuba.gui.components.actions.RemoveAction;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.Map;
import java.util.UUID;

public class OrderLinesDialog extends AbstractWindow {

    @WindowParam
    private CollectionDatasource<OrderLine, UUID> orderLinesDs;

    @Inject
    private ComponentsFactory componentsFactory;

    @Inject
    private VBoxLayout tableBox;
    @Inject
    private Button createBtn;
    @Inject
    private Button editBtn;
    @Inject
    private Button removeBtn;

    @Override
    public void init(Map<String, Object> params) {
        Table table = componentsFactory.createComponent(Table.class);
        table.setDatasource(orderLinesDs);

        table.setWidth("100%");
        table.setHeight("200px");

        CreateAction createAction = new CreateAction(table);
        table.addAction(createAction);
        createBtn.setAction(createAction);

        EditAction editAction = new EditAction(table);
        table.addAction(editAction);
        editBtn.setAction(editAction);

        RemoveAction removeAction = new RemoveAction(table);
        table.addAction(removeAction);
        removeBtn.setAction(removeAction);

        tableBox.add(table);
    }

    public void onCloseBtnClick(Component source) {
        close(CLOSE_ACTION_ID);
    }
}