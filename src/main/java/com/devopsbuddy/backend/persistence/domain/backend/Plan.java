package com.devopsbuddy.backend.persistence.domain.backend;

import com.devopsbuddy.enums.PlansEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Plan implements Serializable {

    /**
     * The Serial Version UID for Serializable classes
     */
    private static final long serialVersionUID = 1L;

    //region Attributes

    @Id
    private int id;

    private String name;

    //endregion

    //region Constructors

    /* Default Constructor */
    public Plan() {
    }

    /**
     * Full Constructor
     *
     * @param plansEnum
     */
    public Plan(PlansEnum plansEnum) {
        this.id = plansEnum.getId();
        this.name = plansEnum.getPlanName();
    }

    //endregion

    //region Equals and HashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plan plan = (Plan) o;

        if (id != plan.id) return false;
        return name != null ? name.equals(plan.name) : plan.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    //endregion

}

