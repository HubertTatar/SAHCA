package com.mycompany.credentialsApp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public class AbstractEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Long version;

    public Long getId() {
        return id;
    }

    public Long getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractEntity that = (AbstractEntity) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        return !(getVersion() != null ? !getVersion().equals(that.getVersion()) : that.getVersion() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getVersion() != null ? getVersion().hashCode() : 0);
        return result;
    }
}
