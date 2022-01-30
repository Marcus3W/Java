// Cache, Main Memory and HDD calculator

// convertors
/*
Enter this number   metric affix    notation    E-notation  Other
0.1	                1d (deci)	    10^-1       1e-1        One tenth of a second (10% of a second)
0.01	            1c (centi)	    10^-2	    1e-2	    One hundredth of a second (1% of a second)
0.001	            1m (milli)	    10^-3	    1e-3        One thousandth of a second
0.000001	        1µ (micro)	    10^-6	    1e-6        One millionth of a second
0.000000001	        1n (nano)	    10^-9	    1e-9        One billionth of a second
0.000000000001	    1p (pico)   	10^-12	    1e-12       One trillionth of a second

1,000	            1k (kilo)	    10^3	    1e3
1,000,000	        1M (mega)	    10^6	    1e6
1,000,000,000	    1G (giga)	    10^9	    1e9
1,000,000,000,000	1T (tera)	    10^12	    1e12
 */

function ns_to(affixTo, ns_amount) {
    let value;
    switch (affixTo) {
        case 's':
            value = ns_amount / 1000000000; // 9 zeros
            console.log(ns_amount + " ns is " + value + " seconds");
            break;
        case 'ms':
            value = ns_amount / 1000000; // 6 zeros
            console.log(ns_amount + " ns is " + value + " ms");
            break;
        case 'µs':
            value = ns_amount / 10000; // 3 zeros
            console.log(ns_amount + " ns is " + value + " micro-seconds");
            break;
    }
    return value;
}
function ms_to(affixTo, ms_amount) {
    let value;
    switch (affixTo) {
        case 's': // SECOND
            value = ms_amount / 1000; // 3 zeros
            console.log(ms_amount + " ms is " + value + " seconds");
            break;
        case 'ns': // NANO
            value = ms_amount * 1000000; // 6 zeros
            console.log(ms_amount + " ms is " + value + " ns");
            break;
        case 'µs': // MICRO
            value = ms_amount * 1000; // 3 zeros
            console.log(ms_amount + " ms is " + value + " micro-seconds");
            break;
    }
    return value;
}
