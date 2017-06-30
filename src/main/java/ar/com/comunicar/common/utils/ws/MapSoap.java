package ar.com.comunicar.common.utils.ws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

/**
 * @author pgoette
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MapSoap")
public class MapSoap {

    @XmlElement(required = true)
    private final List<MapElement> mapElements = new ArrayList<MapElement>();

    public List<MapElement> getMapElements() {
        return this.mapElements;
    }
}