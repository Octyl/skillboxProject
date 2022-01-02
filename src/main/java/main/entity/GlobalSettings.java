package main.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "global_settings")
public class GlobalSettings {
    @Column(name = "MULTIUSER_MODE")
    private boolean multiUserMode;

    @Column(name = "POST_PREMODERATION")
    private boolean postPreModeration;

    @Column(name = "STATISTICS_IS_PUBLIC")
    private boolean statisticsIsPublic;
}
