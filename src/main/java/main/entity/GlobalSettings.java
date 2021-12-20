package main.entity;

import javax.persistence.*;

@Entity(name = "global_settings")
public class GlobalSettings {
    @Column(name = "MULTIUSER_MODE")
    private boolean multiUserMode;

    @Column(name = "POST_PREMODERATION")
    private boolean postPreModeration;

    @Column(name = "STATISTICS_IS_PUBLIC")
    private boolean statisticsIsPublic;
}
