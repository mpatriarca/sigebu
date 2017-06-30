package ar.com.comunicar.common.utils.ws;

import javax.xml.bind.annotation.*;

/**
 * @author pgoette
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "mapElement")
public class MapElement {

    @XmlAttribute(name = "key", required = true)
    private String key;

    @XmlAttribute(name = "value", required = true)
    private String value;

    public MapElement() {
    }

    public MapElement(String key, String value) {
        super();
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
