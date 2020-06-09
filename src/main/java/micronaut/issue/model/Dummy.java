package micronaut.issue.model;

import io.micronaut.core.annotation.Introspected;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;

@Introspected
public class Dummy {

    @Nullable
    private List<List<Object>> names;

    @NotNull
    private List<List<Object>> values;

    @Nullable
    public List<List<Object>> getNames() {
        return names;
    }

    public void setNames(@Nullable List<List<Object>> names) {
        this.names = names;
    }

    public List<List<Object>> getValues() {
        return values;
    }

    public void setValues(@NotNull List<List<Object>> values) {
        this.values = values;
    }
}
