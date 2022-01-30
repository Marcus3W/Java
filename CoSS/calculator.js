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
function hit_ration_MM(cache, main_memory) {
    const total_memory = 1; // in percent
    let remaining_memory =  total_memory - cache; // get remaining memory in percent
    return (main_memory * remaining_memory * 100).toFixed(1) // returns % for main memory
}
function hit_ration_HDD(cache, main_memory) {
    const total_memory = 1; // in percent
    let remaining_memory =  total_memory - cache; // get remaining memory in percent
    let main_memory_amount = (main_memory * remaining_memory); // returns % for main memory
    return ((remaining_memory - main_memory_amount) * 100).toFixed(1) ;
}

// TOTAL TIME FUNCTIONS
function calculate_cache(cache_speed, cache_ratio) {
    return (cache_speed) * cache_ratio;
}
function calculate_MM(cache_speed, MM_speed, main_memory_ratio) {
    return (MM_speed + cache_speed) * main_memory_ratio;
}
function calculate_HDD(cache_speed, MM_speed, HDD_speed_ms, HDD_ratio) {
    // convert ms into ns
    let HDD_speed_ns = ms_to('ns', HDD_speed_ms)
    return (HDD_speed_ns + MM_speed + cache_speed) * HDD_ratio;
}


function main(cache, main_memory, cache_speed_ns, MM_speed_ns, HDD_speed_ms) {
    // GET RATIOS
    let cache_ratio = cache * 100;
    let main_memory_ratio = hit_ration_MM(cache,main_memory);
    console.log('Main Memory ratio is ' + main_memory_ratio);
    let HDD_ratio = hit_ration_HDD(cache,main_memory);
    console.log('HDD is ' + HDD_ratio);

    // GET CACHE TOTAL SPEED
    let cache_total_time = calculate_cache(cache_speed_ns, cache_ratio);
    console.log(cache_total_time + ' in ns')

    // GET MAIN MEMORY TOTAL SPEED
    let main_memory_total_time = calculate_MM(cache_speed_ns, MM_speed_ns, main_memory_ratio);
    console.log(main_memory_total_time + ' in ns')

    // GET HDD TOTAL SPEED
    let HDD_total_time = calculate_HDD(cache_speed_ns, MM_speed_ns, HDD_speed_ms, HDD_ratio);
    console.log(HDD_total_time + ' in ns')

    return cache_total_time + main_memory_total_time + HDD_total_time
}
console.log("Total time in ns is " + main(0.3,0.8,18, 112, 20));