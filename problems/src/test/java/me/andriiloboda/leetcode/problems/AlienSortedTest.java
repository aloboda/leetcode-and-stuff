package me.andriiloboda.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Unit tests for {@link AlienSorted}
 */
public class AlienSortedTest {
	final AlienSorted service = new AlienSorted();

	@Test
	public void sample1() {
		assertThat(service.isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"), is(false));
	}

	@Test
	public void sample2() {
		assertThat(service.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"), is(false));
	}

	@Test
	public void sample3() {
		assertThat(service.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"), is(true));
	}

	@Test
	public void sample4() {
		assertThat(service.isAlienSorted(new String[]{"zirqhpfscx", "zrmvtxgelh", "vokopzrtc", "nugfyso", "rzdmvyf", "vhvqzkfqis", "dvbkppw", "ttfwryy", "dodpbbkp", "akycwwcdog"}, "khjzlicrmunogwbpqdetasyfvx"), is(false));
	}
}
