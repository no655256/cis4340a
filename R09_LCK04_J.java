private final Map<Integer, String> mapView =
    Collections.synchronizedMap(new HashMap<Integer, String>());
private final Set<Integer> setView = mapView.keySet();
 
public Map<Integer, String> getMap() {
  return mapView;
}
 
public void doSomething() {
  synchronized (mapView) {  // Synchronize on map, rather than set
    for (Integer k : setView) {
      // ...
    }
  }
}
