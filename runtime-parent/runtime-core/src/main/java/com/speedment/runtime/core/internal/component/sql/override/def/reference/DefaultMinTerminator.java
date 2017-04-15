package com.speedment.runtime.core.internal.component.sql.override.def.reference;

import com.speedment.runtime.core.component.sql.SqlStreamOptimizerInfo;
import com.speedment.runtime.core.component.sql.override.reference.MinTerminator;
import com.speedment.runtime.core.internal.manager.sql.SqlStreamTerminator;
import com.speedment.runtime.core.internal.stream.builder.pipeline.ReferencePipeline;
import java.util.Comparator;
import static java.util.Objects.requireNonNull;
import java.util.Optional;

/**
 *
 * @author Per Minborg
 * @param <ENTITY> the original stream entity source type 
 */
public final class DefaultMinTerminator<ENTITY> implements MinTerminator<ENTITY> {

    private DefaultMinTerminator() {
    }

    @Override
    public <T> Optional<T> apply(
        final SqlStreamOptimizerInfo<ENTITY> info,
        final SqlStreamTerminator<ENTITY> sqlStreamTerminator,
        final ReferencePipeline<T> pipeline,
        final Comparator<? super T> comparator
    ) {
        requireNonNull(info);
        requireNonNull(sqlStreamTerminator);
        requireNonNull(pipeline);
        requireNonNull(comparator);
        return sqlStreamTerminator.optimize(pipeline).getAsReferenceStream().min(comparator);
    }

    public static final MinTerminator<?> DEFAULT = new DefaultMinTerminator<>();

}
