package brs.fluxcapacitor;

import brs.fluxcapacitor.FluxHistory.Element;

public enum FluxInt {
  //255 for 45454 and 136362 for 45454 x 3
	 // MAX_NUMBER_TRANSACTIONS(new FluxHistory<>(45454, new Element<>(HistoricalMoments.PRE_DYMAXION, 136362))),
	 // MAX_PAYLOAD_LENGTH(new FluxHistory<>(45454 * 176, new Element<>(HistoricalMoments.PRE_DYMAXION, 136362 * 176)));

  MAX_NUMBER_TRANSACTIONS(new FluxHistory<>(45454, new Element<>(HistoricalMoments.PRE_DYMAXION, 136362))),
  MAX_PAYLOAD_LENGTH(new FluxHistory<>(45454 * 176, new Element<>(HistoricalMoments.PRE_DYMAXION, 136362 * 176)));

	
  private FluxHistory<Integer> flux;

  FluxInt(FluxHistory<Integer> flux) {
    this.flux = flux;
  }

  public FluxHistory<Integer> getFlux() {
    return flux;
  }

}
