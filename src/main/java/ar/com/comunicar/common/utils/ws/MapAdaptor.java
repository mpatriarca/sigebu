package ar.com.comunicar.common.utils.ws;

import java.util.*;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author pgoette
 */
public class MapAdaptor extends XmlAdapter<MapSoap, Map<String, String>> {

    @Override
    public MapSoap marshal(Map<String, String> v) throws Exception {
        MapSoap mapSoap = new MapSoap();
        List<MapElement> aList = mapSoap.getMapElements();

        for (Map.Entry<String, String> e : v.entrySet()) {
            aList.add(new MapElement(e.getKey(), e.getValue()));
        }

        return mapSoap;
    }

    @Override
    public Map<String, String> unmarshal(MapSoap v) throws Exception {
        Map<String, String> map = new HashMap<String, String>();

        for (MapElement e : v.getMapElements()) {
            map.put(e.getKey(), e.getValue());
        }

        return map;
    }

}
