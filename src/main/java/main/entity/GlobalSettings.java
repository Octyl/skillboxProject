package main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "global_settings")
public class GlobalSettings
{
    private boolean multiUserMode;

    private boolean postPreModeration;

    private boolean statisticsIsPublic;
}
