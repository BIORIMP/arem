/*
 *  Copyright 2001-2014 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.Map;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock address JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class Address extends DirectBean {

    /**
     * The number.
     * This will be the flat, house number or house name.
     */
    @PropertyDefinition
    private int number;
    // various empty comments for testing
    /**
     *
     */
    @PropertyDefinition
    private String street;
    /**
     */
    @PropertyDefinition
    private String city;
    /** */
    @PropertyDefinition
    private Person owner;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code Address}.
     * @return the meta-bean, not null
     */
    public static Address.Meta meta() {
        return Address.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(Address.Meta.INSTANCE);
    }

    @Override
    public Address.Meta metaBean() {
        return Address.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * This will be the flat, house number or house name.
     * @return the value of the property
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the number.
     * This will be the flat, house number or house name.
     * @param number  the new value of the property
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Gets the the {@code number} property.
     * This will be the flat, house number or house name.
     * @return the property, not null
     */
    public final Property<Integer> number() {
        return metaBean().number().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the street.
     * @return the value of the property
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street.
     * @param street  the new value of the property
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the the {@code street} property.
     * @return the property, not null
     */
    public final Property<String> street() {
        return metaBean().street().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the city.
     * @return the value of the property
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     * @param city  the new value of the property
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the the {@code city} property.
     * @return the property, not null
     */
    public final Property<String> city() {
        return metaBean().city().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the owner.
     * @return the value of the property
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Sets the owner.
     * @param owner  the new value of the property
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * Gets the the {@code owner} property.
     * @return the property, not null
     */
    public final Property<Person> owner() {
        return metaBean().owner().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public Address clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            Address other = (Address) obj;
            return (getNumber() == other.getNumber()) &&
                    JodaBeanUtils.equal(getStreet(), other.getStreet()) &&
                    JodaBeanUtils.equal(getCity(), other.getCity()) &&
                    JodaBeanUtils.equal(getOwner(), other.getOwner());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getNumber());
        hash = hash * 31 + JodaBeanUtils.hashCode(getStreet());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCity());
        hash = hash * 31 + JodaBeanUtils.hashCode(getOwner());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(160);
        buf.append("Address{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("number").append('=').append(JodaBeanUtils.toString(getNumber())).append(',').append(' ');
        buf.append("street").append('=').append(JodaBeanUtils.toString(getStreet())).append(',').append(' ');
        buf.append("city").append('=').append(JodaBeanUtils.toString(getCity())).append(',').append(' ');
        buf.append("owner").append('=').append(JodaBeanUtils.toString(getOwner())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code Address}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code number} property.
         */
        private final MetaProperty<Integer> number = DirectMetaProperty.ofReadWrite(
                this, "number", Address.class, Integer.TYPE);
        /**
         * The meta-property for the {@code street} property.
         */
        private final MetaProperty<String> street = DirectMetaProperty.ofReadWrite(
                this, "street", Address.class, String.class);
        /**
         * The meta-property for the {@code city} property.
         */
        private final MetaProperty<String> city = DirectMetaProperty.ofReadWrite(
                this, "city", Address.class, String.class);
        /**
         * The meta-property for the {@code owner} property.
         */
        private final MetaProperty<Person> owner = DirectMetaProperty.ofReadWrite(
                this, "owner", Address.class, Person.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "number",
                "street",
                "city",
                "owner");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return number;
                case -891990013:  // street
                    return street;
                case 3053931:  // city
                    return city;
                case 106164915:  // owner
                    return owner;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends Address> builder() {
            return new DirectBeanBuilder<Address>(new Address());
        }

        @Override
        public Class<? extends Address> beanType() {
            return Address.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code number} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> number() {
            return number;
        }

        /**
         * The meta-property for the {@code street} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> street() {
            return street;
        }

        /**
         * The meta-property for the {@code city} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> city() {
            return city;
        }

        /**
         * The meta-property for the {@code owner} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Person> owner() {
            return owner;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return ((Address) bean).getNumber();
                case -891990013:  // street
                    return ((Address) bean).getStreet();
                case 3053931:  // city
                    return ((Address) bean).getCity();
                case 106164915:  // owner
                    return ((Address) bean).getOwner();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    ((Address) bean).setNumber((Integer) newValue);
                    return;
                case -891990013:  // street
                    ((Address) bean).setStreet((String) newValue);
                    return;
                case 3053931:  // city
                    ((Address) bean).setCity((String) newValue);
                    return;
                case 106164915:  // owner
                    ((Address) bean).setOwner((Person) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
