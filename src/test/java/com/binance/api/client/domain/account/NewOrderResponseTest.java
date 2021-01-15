package com.binance.api.client.domain.account;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @see NewOrderResponse
 */
public class NewOrderResponseTest {

  private NewOrderResponse newOrderResponse;
  private NewOrderTrade trade;

  @Before
  public void setUp() {
    newOrderResponse = new NewOrderResponse();
    trade = new NewOrderTrade();
    trade.setId(123L);
  }

  @Test
  public void shouldHandleToStringWithNullFills() {
    assertThat(newOrderResponse.toString(), containsString(",fills="));
  }

  @Test
  public void shouldHandleToStringWithNoFills() {
    newOrderResponse.setFills(Collections.emptyList());
    assertThat(newOrderResponse.toString(), containsString(",fills="));
  }

  @Test
  public void shouldHandleToStringWithFills() {
    newOrderResponse.setFills(trades(trade));
    assertThat(newOrderResponse.toString(), containsString(",fills=Trade[id=123,"));
  }

  private static List<NewOrderTrade> trades(final NewOrderTrade... trades) {
    return Arrays.asList(trades);
  }
}
