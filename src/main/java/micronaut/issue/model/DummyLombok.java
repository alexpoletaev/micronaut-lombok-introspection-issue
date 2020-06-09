package micronaut.issue.model;

import io.micronaut.core.annotation.Introspected;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@NoArgsConstructor
@Introspected
public class DummyLombok {

    @Nullable
    private List<List<Object>> names;

    @NotNull
    private List<List<Object>> values;

    @Builder(builderMethodName = "dummyBuilder")
    public DummyLombok(@Nullable List<List<Object>> names, @NotNull List<List<Object>> values) {
        this.names = names;
        this.values = values;
    }
}
