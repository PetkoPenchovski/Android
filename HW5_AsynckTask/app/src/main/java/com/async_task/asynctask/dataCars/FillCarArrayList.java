package com.async_task.asynctask.dataCars;


import com.async_task.asynctask.object.Car;

import java.util.ArrayList;

public class FillCarArrayList {

    private static Car car;
    private static ArrayList<Car> cars = new ArrayList<>();
    private static ArrayList<String> carURL = new ArrayList<>();
    private static ArrayList<String> carModel = new ArrayList<>();
    private static ArrayList<String> carYear = new ArrayList<>();
    private static ArrayList<String> carInfo = new ArrayList<>();

    private static final String BMWE23_URL = "https://i.ytimg.com/vi/hlBMbIMwTeo/maxresdefault.jpg";
    private static final String BMWE32_URL = "https://i.ytimg.com/vi/spqfWjWbqX8/maxresdefault.jpg";
    private static final String BMWE38_URL = "http://bmwspirit.com/wp-content/uploads/2016/06/01-1.jpg";
    private static final String BMWE65_URL = "https://i.pinimg.com/originals/42/24/29/422429a1023dc5a759a20426d483ffd1.jpg";
    private static final String BMWF01_URL = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/BMW_7er_L_%28F02%29_%E2%80%93_Frontansicht%2C_7._September_2013%2C_M%C3%BCnster.jpg/1280px-BMW_7er_L_%28F02%29_%E2%80%93_Frontansicht%2C_7._September_2013%2C_M%C3%BCnster.jpg";
    private static final String BMWG12_URL = "https://content.icarcdn.com/styles/article_cover/s3/field/article/cover/2016/2016_bmw_740li_first_impressions_cover.jpg?itok=oy7LmCFM";

    private static final String BMWE23_MODEL = "BMW E23";
    private static final String BMWE32_MODEL = "BMW E32";
    private static final String BMWE38_MODEL = "BMW E38";
    private static final String BMWE65_MODEL = "BMW E65";
    private static final String BMWF01_MODEL = "BMW F01";
    private static final String BMWG12_MODEL = "BMW G12";

    private static final String BMWE23_YEAR = "1977 - 1986";
    private static final String BMWE32_YEAR = "1986 - 1994";
    private static final String BMWE38_YEAR = "1994 - 2001";
    private static final String BMWE65_YEAR = "2001 - 2008";
    private static final String BMWF01_YEAR = "2008 - 2015";
    private static final String BMWG12_YEAR = "2015 - 2020";

    private static final String BMWE23_INFO = "The E23 is the first generation 7 Series, and was produced from 1977 to 1987. It was built in a 4-door sedan body style with 6-cylinder engines, to replace the E3 sedans. From 1983 to 1986, a turbocharged 6-cylinder engine was available.\n" +
            "\n" +
            "The E23 introduced many electronic features for the first time in a BMW, including an on-board computer, service interval indicator, a \"check control panel\" (warning lights to indicate system faults to the driver), a dictaphone and complex climate control systems. It was also the first BMW to offer an anti-lock braking system (ABS), a driver's airbag and double-link front suspension.";
    private static final String BMWE32_INFO = "The E32 is the second generation of 7 Series, which was produced from 1986 to 1994. It was initially available with a straight-six or V12 engine. In 1992, V8 engines became available.\n" +
            "\n" +
            "The E32 introduced the following features for the first time in a BMW: Electronic Damper Control,[2] V12 and V8 engines, double glazing, the CAN bus electronic protocol,[3] Xenon headlamps,[4] traction control[5] and dual-zone climate control.[6] The E32 750i was the first car adhering to BMW's self-imposed speed limit of 250 km/h (155 mph).[7] The 'iL' models were the first time that a long-wheelbase option was offered by BMW.";
    private static final String BMWE38_INFO = "The E38 is the third generation of the 7 Series, which was produced from 1994 to 2001. The model range consisted of standard length and long wheelbase (\"iL\" models) sedans.\n" +
            "\n" +
            "The petrol engines available consisted of straight-six, V8 and V12 engines. The E38 was the first 7 Series to be available with a diesel engine; initially a turbo straight-six, which was joined by a turbo V8 in 1998.\n" +
            "\n" +
            "The E38 was the first car available with curtain airbags. It was also the first European car to offer satellite navigation[8] and the first BMW to offer an in-built television.";
    private static final String BMWE65_INFO = "The E65/E66/E67/E68 is the fourth generation 7 Series, which was produced from 2001 to 2008. The model range consisted of standard length and long wheelbase (\"Li\" models) sedans.\n" +
            "\n" +
            "The E65/E66/E67/E68 was the first BMW to include iDrive, \"flame-surfacing\" exterior styling, active anti-roll bars, a 6-speed automatic transmission, an electronic Smart Key (dispensing with the traditional metallic key) and night vision. The 760i model was the world's first production V12 engine to use direct injection.[9][10]";
    private static final String BMWF01_INFO = "The F01/F02/F03/F04 is the fifth-generation 7 Series, which was produced from 2008 to 2015. The model range consisted of standard length and long wheelbase (\"Li\" models) sedans.\n" +
            "\n" +
            "The F01 was the first BMW to be available with a hybrid drivetrain (\"ActiveHybrid 7\"), an 8-speed automatic transmission and a turbocharged V12 engine. It was also the first 7 Series to be available with a turbocharged petrol engine and all-wheel drive (xDrive).";
    private static final String BMWG12_INFO = "The G11/G12 is the sixth generation of 7 Series, which has been in production since 2015. It was revealed on June 10, 2015 at BMW's headquarters in Munich.[11] An official public reveal took place at the 2015 International Motor Show Germany.\n" +
            "\n" +
            "G11 is the codename for the short-wheelbase model, the extended wheelbase model is codenamed G12 and designated with an additional L letter.\n" +
            "\n" +
            "The G11/G12 is the first car lineup of BMW Group to be based on the modular OKL platform (Oberklasse, German for luxury class).[12] The OKL platform adopts technology first introduced in BMW i models, namely the introduction of carbon-fiber-reinforced polymer as structural chassis components.\n" +
            "\n" +
            "As part of BMW's strategy of introducing plug-in hybrid variants for all future car models,[13] both, the short and long-wheelbase models will be available with hybrid powertrains under the designations 740e and 740Le in 2016.[14]";

    private static void fillList() {
        carURL.add(BMWE23_URL);
        carURL.add(BMWE32_URL);
        carURL.add(BMWE38_URL);
        carURL.add(BMWE65_URL);
        carURL.add(BMWF01_URL);
        carURL.add(BMWG12_URL);

        carModel.add(BMWE23_MODEL);
        carModel.add(BMWE32_MODEL);
        carModel.add(BMWE38_MODEL);
        carModel.add(BMWE65_MODEL);
        carModel.add(BMWF01_MODEL);
        carModel.add(BMWG12_MODEL);

        carYear.add(BMWE23_YEAR);
        carYear.add(BMWE32_YEAR);
        carYear.add(BMWE38_YEAR);
        carYear.add(BMWE65_YEAR);
        carYear.add(BMWF01_YEAR);
        carYear.add(BMWG12_YEAR);

        carInfo.add(BMWE23_INFO);
        carInfo.add(BMWE32_INFO);
        carInfo.add(BMWE38_INFO);
        carInfo.add(BMWE65_INFO);
        carInfo.add(BMWF01_INFO);
        carInfo.add(BMWG12_INFO);
    }

    private static void fillCarList() {
        for (int i = 0; i < 6; i++) {
            String carsURL = carURL.get(i);
            String carsModel = carModel.get(i);
            String carsYear = carYear.get(i);
            String carsInfo = carInfo.get(i);

            car = new Car(carsURL, carsModel, carsYear, carsInfo);
            cars.add(car);
        }
    }

    public static void getFillList() {
        fillList();
    }

    public static void getFillCarList() {
        fillCarList();
    }

    public static ArrayList<Car> getCars() {
        return cars;
    }

}

