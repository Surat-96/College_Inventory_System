-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2019 at 05:09 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_model`
--

CREATE TABLE `admin_model` (
  `ID` int(11) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `ADMINNAME` varchar(255) NOT NULL,
  `EMAILID` varchar(255) NOT NULL,
  `MOBILENO` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_model`
--

INSERT INTO `admin_model` (`ID`, `ADDRESS`, `ADMINNAME`, `EMAILID`, `MOBILENO`, `PASSWORD`) VALUES
(1, 'Serampore, Hooghly', 'Admin', 'banerjeesurat@gmail.com', '3326224305', 'surat@1996');

-- --------------------------------------------------------

--
-- Table structure for table `apply_stock_model`
--

CREATE TABLE `apply_stock_model` (
  `REQ_ID` int(100) NOT NULL,
  `DATE` varchar(255) NOT NULL,
  `DEPARTMENT` varchar(255) NOT NULL,
  `ITEMNAME` varchar(255) NOT NULL,
  `QUANTITY` varchar(255) NOT NULL,
  `REQ_QUANTITY` varchar(255) NOT NULL,
  `STAFFNAME` varchar(255) NOT NULL,
  `STATUS` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `apply_stock_model`
--

INSERT INTO `apply_stock_model` (`REQ_ID`, `DATE`, `DEPARTMENT`, `ITEMNAME`, `QUANTITY`, `REQ_QUANTITY`, `STAFFNAME`, `STATUS`) VALUES
(1, '2018-09-10T10:20', 'it', 'Acer Monitor', '40', '10', 'Animesh Pal', '2'),
(2, '2019-01-14T10:30', 'it', 'Rotated Chair', '50', '10', 'Animesh Pal', '3'),
(3, '2019-01-15T12:00', 'it', '16-to-1-multiplexer-and-1-to-16-demux', '15', '2', 'Animesh Pal', '0'),
(4, '2019-05-02T20:45', 'it', 'l-d-r-characteristic-apparatus', '8', '4', 'Animesh Pal', '1');

-- --------------------------------------------------------

--
-- Table structure for table `enqury_model`
--

CREATE TABLE `enqury_model` (
  `ID` int(100) NOT NULL,
  `DEPARTMENT` varchar(255) NOT NULL,
  `DESIGNATION` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `MSG` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `TIME` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enqury_model`
--

INSERT INTO `enqury_model` (`ID`, `DEPARTMENT`, `DESIGNATION`, `EMAIL`, `MSG`, `NAME`, `TIME`) VALUES
(1, 'cse', 'hod', 'chan.mukh@gmail.com', 'HP MOUSE IS A GOOD PRODUCT..', 'Chandan Mukherjee', '2019-03-19T09:26'),
(3, 'it', 'hod', 'sagar.chak@gmail.com', 'Hp Mouse is a too good & too easy to handel...', 'Sagar Chakraborty', '2019-01-03T10:30');

-- --------------------------------------------------------

--
-- Table structure for table `service_model`
--

CREATE TABLE `service_model` (
  `SERID` int(100) NOT NULL,
  `DEPARTMENT` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `MSG` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `STATUS` varchar(255) NOT NULL,
  `TIME` varchar(255) NOT NULL,
  `TYPE` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `service_model`
--

INSERT INTO `service_model` (`SERID`, `DEPARTMENT`, `EMAIL`, `MSG`, `NAME`, `STATUS`, `TIME`, `TYPE`) VALUES
(1, 'it', 'pal.1996ani@gmail.com', 'In lab3, 5 keyboard repairing..', 'Animesh Pal', '2', '2019-04-02T10:10', 'keyboard repair'),
(2, 'it', 'pal.1996ani@gmail.com', 'my monitor is not working properly..', 'Animesh Pal', '1', '2019-04-03T10:50', 'Monitor repair'),
(3, 'it', 'pal.1996ani@gmail.com', 'My printer is not working ...', 'Animesh Pal', '3', '2019-04-05T11:10', 'Printer repair');

-- --------------------------------------------------------

--
-- Table structure for table `staff_model`
--

CREATE TABLE `staff_model` (
  `ID` int(100) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `DEPARTMENT` varchar(255) NOT NULL,
  `DESIGNATION` varchar(255) NOT NULL,
  `EMAILID` varchar(255) NOT NULL,
  `JOINING_DATE` varchar(255) NOT NULL,
  `MOBILENO` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `STAFFNAME` varchar(255) NOT NULL,
  `STATUS` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff_model`
--

INSERT INTO `staff_model` (`ID`, `ADDRESS`, `DEPARTMENT`, `DESIGNATION`, `EMAILID`, `JOINING_DATE`, `MOBILENO`, `PASSWORD`, `STAFFNAME`, `STATUS`) VALUES
(1, 'Mankundu, Hooghly', 'it', 'hod', 'chak.1986sagar@gmail.com', '2012-03-01', '9384578632', 'sagar#1986', 'Sagar Chakraborty', '0'),
(2, 'Mankundu, Hooghly', 'it', 'teachers', 'pal.1996ani@gmail.com', '2013-07-01', '9433813925', 'ani#1996', 'Animesh Pal', '0'),
(3, 'Uttarpara, Hooghly', 'cse', 'hod', 'chan.mukh@gmail.com', '2016-06-01', '9238450176', 'chan%mukh', 'Chandan Mukherjee', '0'),
(4, 'Belur, Hooghly', 'cse', 'teachers', 'chat#ari@gmail.com', '2015-08-07', '7064958102', 'chat12ari', 'Aritra Chatterjee', '0'),
(5, 'Liluah, Howrah', 'cse', 'labassit', 'ram.sharma@gmail.com', '2012-02-01', '9436842056', 'ram12sharma', 'Ram Sharma', '0'),
(6, 'Ramnagar, Digha', 'it', 'labassit', 'soumayan.ban@gmail.com', '2013-07-01', '9076452638', 'sand#1995', 'Sandip Raul', '0');

-- --------------------------------------------------------

--
-- Table structure for table `stock_model`
--

CREATE TABLE `stock_model` (
  `ID` int(100) NOT NULL,
  `COST` varchar(255) NOT NULL,
  `DETAILS` varchar(255) NOT NULL,
  `IMAGE` varchar(255) NOT NULL,
  `ITEMNAME` varchar(255) NOT NULL,
  `PURCHASEDATE` varchar(255) NOT NULL,
  `QUANTITY` varchar(255) NOT NULL,
  `TYPE` varchar(255) NOT NULL,
  `WARRENTY` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock_model`
--

INSERT INTO `stock_model` (`ID`, `COST`, `DETAILS`, `IMAGE`, `ITEMNAME`, `PURCHASEDATE`, `QUANTITY`, `TYPE`, `WARRENTY`) VALUES
(1, '3,70,000 RS', 'A vertical milling machine can be distinguished from a horizontal milling machine by the position of its spindle which is vertical or perpendicular to the work table. ', 'Vertical milling machine.jpg', 'Vertical Milling Machine', '2018-03-01', '3', 'mechanical', '2020-03-31'),
(2, '1,45,000 RS', 'Works with all formable plastics,All metal construction,Heavy duty 10\' grounded electrical cord,Fuse protected,110V version', 'vacuum-forming-machine.jpg', 'Vaccum Forming Machine ', '2018-01-01', '4', 'mechanical', '2020-02-01'),
(3, '3,50,000 RS', 'Surface grinding is used to produce a smooth finish on flat surfaces. It is a widely used abrasive machining process.', 'surface-grinder.jpg', 'Surface Grinding Machine', '2018-02-02', '3', 'mechanical', '2021-03-03'),
(4, '20,000 RS', 'Scientico,Stainless Steel,Set 100 Gm To 1 Kg,Horizontal Arm 75 Cm,Vertical Arm 20 Cm,Display Analog,Frequency 50 Hz', 'cantilever-beam-apparatus.png', 'Cantilever Beam  Apparatus', '2018-04-01', '10', 'civil', '2020-04-01'),
(5, '45,000 RS', 'A bench mounting 3-point bend apparatus to allow investigations into the stiffness in bending of different materials of the same cross-section', 'Stiffness-Bending-Torsion.png', 'Stifness Materials', '2018-03-01', '6', 'civil', '2020-03-31'),
(6, '60,000 RS', 'Bench-top trainer, allows students to investigate the fundamental principles of air conditioning.', 'Air-Conditioning-Trainer.jpg', 'AIR CONDITIONING TRAINER', '2018-04-01', '6', 'civil', '2020-03-31'),
(7, '25,000 RS', 'It is a high defination monitor, 28 inches width.', 'monitor.jpg', 'Acer Monitor', '2018-02-02', '40', 'cse_it', '2020-01-31'),
(8, '5000 RS', 'It is a light weight keyboard with usb port.', 'keyboard.jpg', 'Hp Keyboard', '2018-02-02', '20', 'cse_it', '2020-03-31'),
(9, '2,000 RS', 'It is a wired mouse with usb port.', 'mouse.jpg', 'Hp Mouse', '2018-02-02', '20', 'cse_it', '2020-03-31'),
(10, '6,000 RS', 'It is a rotated chair & too soft with low cost', 'chair.jpeg', 'Rotated Chair', '2018-02-02', '40', 'general', '2019-03-31'),
(11, '3,000 RS', 'It is a computer table.', 'Computer-Table.jpg', 'Computer-Table', '2018-02-02', '20', 'general', '2019-01-31'),
(12, '4,000 RS', 'Display Type Digital, Frequency Range (Hertz) 50, Material Stainless Steel, Grade Automatic, Power (Volt) 220 V, Phase Single, Brand Scientico', 'electronics-training.png', 'Electronics training equipment', '2018-01-02', '10', 'electronics', '2019-03-31'),
(13, '4,500 RS', '?	Power Supply : 0-10 Volt DC ?	Voltmeter : 0-10 Volt DC, Ammeter : 50 mA, Lamp & Wood Plank : 100W , 50cm Wooden Plank , Size : 11&#8243;x9&#8243;x3&#8243; inch', 'l-d-r-characteristic-apparatus.jpg', 'l-d-r-characteristic-apparatus', '2018-01-01', '8', 'electronics', '2020-04-30'),
(14, '4,000 RS', '?	+/-12V/350mA DC Power Supply ?	Carrier Generator 75 KHz ?	Modulating signal Generator 10 KHz , Frequency Modulator ,Frequency Demodulator, Set of 2 mm Patch Chords & Manual', 'frequency-modulation-demodulation.png', 'frequency-modulation-demodulation', '2018-01-01', '15', 'electronics', '2020-04-30'),
(15, '5,000 RS', 'To Study and verify the truth tables of: 16 to 1 Multiplexer using IC 74150, 1:16 De-multiplexer using IC 74154 instrument comprises of DC regulated, Power Supply 5VDC/150mA, 6 sockets for logic ?1? & logic ?0? each, one output indicator.', '16-to-1-multiplexer-and-1-to-16-demux.jpg', '16-to-1-multiplexer-and-1-to-16-demux', '2018-12-01', '30', 'electronics', '2020-03-31'),
(16, '5,000 RS', 'Rugged design ,Light weight ,Enhanced performance', 'hamming-code-error-detect-correct.jpg', 'hamming-code-error-detect-correct', '2018-02-02', '10', 'electrical', '2019-03-31'),
(17, '3,500 RS', '8 ttl compatible slide switches as logic level inputs, Logic high and logic low are displayed by dual color led, Two crystal generated clock output of 10hz and 1hz, Logic probe to check logic low, logic high and pulse.', 'digital-trainer-with-bread-board.jpg', 'digital-trainer-with-bread-board', '2018-02-02', '20', 'electrical', '2019-01-31'),
(18, '4,000 RS', 'DC power supply : +12 V, -12 V, +5 V, -5 V, Variable DC power supply : 0 to 1 V, Sine wave generator, Frequency : 800 Hz to 8 KHz, Amplitude : 0 to 5 Vpp.', 'power-and-differential-amplifier.jpg', 'power-and-differential-amplifier', '2018-02-01', '15', 'electrical', '2019-03-31'),
(19, '5,500 RS', 'It is a simple form of bridge giving maximum accuracy while comparing capacitance in term of resistance. Three decade dials x10, x100 and 1000 ohms from one arm. The other arm has also decade dials x10, x100 and 1000 ohms. ', 'desauty-bridge.jpg', 'Desauty Bridge', '2018-02-01', '8', 'electrical', '2020-03-31');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_model`
--
ALTER TABLE `admin_model`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `apply_stock_model`
--
ALTER TABLE `apply_stock_model`
  ADD PRIMARY KEY (`REQ_ID`);

--
-- Indexes for table `enqury_model`
--
ALTER TABLE `enqury_model`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `service_model`
--
ALTER TABLE `service_model`
  ADD PRIMARY KEY (`SERID`);

--
-- Indexes for table `staff_model`
--
ALTER TABLE `staff_model`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `UK_954bxl3o8dyqvll8aggl9033s` (`EMAILID`);

--
-- Indexes for table `stock_model`
--
ALTER TABLE `stock_model`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_model`
--
ALTER TABLE `admin_model`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `apply_stock_model`
--
ALTER TABLE `apply_stock_model`
  MODIFY `REQ_ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `enqury_model`
--
ALTER TABLE `enqury_model`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `service_model`
--
ALTER TABLE `service_model`
  MODIFY `SERID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `staff_model`
--
ALTER TABLE `staff_model`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `stock_model`
--
ALTER TABLE `stock_model`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
