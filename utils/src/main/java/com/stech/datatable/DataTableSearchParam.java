package com.stech.datatable;

import lombok.Data;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
public class DataTableSearchParam {

    private int draw;

    private int start;

    private int length;

    private List<OrderParam> order;

    private List<Column> columns;

    private SearchParam search;

    public List<OrderParam> getOrder() {
        return order.stream()
                .filter(o -> Objects.nonNull(o.getColumn()))
                .collect(Collectors.toList());
    }

    public String getGlobalSearchValue() {
        return Objects.nonNull(search) ? search.getValue() : null;
    }

    public String getSearchColumn() {
        return Objects.nonNull(search) ? search.getColumn() : null;
    }

    public String getSearchColumnValue() {
        return Objects.nonNull(search) && Objects.nonNull(search.getColumn()) ? search.getColumnSearchValue() : null;
    }

    @Override
    public String toString() {
        return "DataTableSearchParam{" +
                "draw=" + draw +
                ", start=" + start +
                ", length=" + length +
                ", order=" + order +
                ", columns=" + columns +
                ", search=" + search +
                '}';
    }
}

