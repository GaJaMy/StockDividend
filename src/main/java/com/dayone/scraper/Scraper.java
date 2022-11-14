package com.dayone.scraper;

import com.dayone.model.Company;
import com.dayone.model.ScrapResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapResult scrap(Company company);
}
