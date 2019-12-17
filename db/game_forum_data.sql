-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- 主机： 127.0.0.1
-- 生成日期： 2019-12-17 12:53:03
-- 服务器版本： 10.1.36-MariaDB
-- PHP 版本： 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 数据库： `game_forum`
--

-- --------------------------------------------------------

--
-- 表的结构 `games`
--

CREATE TABLE `games` (
  `id` int(11) NOT NULL,
  `url` varchar(255) NOT NULL,
  `gamename` varchar(255) NOT NULL,
  `icon` varchar(255) NOT NULL,
  `introduction` varchar(1023) NOT NULL,
  `help` varchar(1023) NOT NULL,
  `postnum` int(11) NOT NULL DEFAULT '0',
  `addone` int(11) DEFAULT NULL,
  `addtwo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `games`
--

INSERT INTO `games` (`id`, `url`, `gamename`, `icon`, `introduction`, `help`, `postnum`, `addone`, `addtwo`) VALUES
(1, '123', '123', '123', '123', '123', 3, NULL, NULL),
(2, '456', '456', '456', '456', '456', 4, NULL, NULL),
(3, '789', '789', '789', '789', '789', 0, NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `message`
--

CREATE TABLE `message` (
  `id` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `postid` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `messageContent` varchar(1023) NOT NULL,
  `addone` int(11) DEFAULT NULL,
  `addtwo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `message`
--

INSERT INTO `message` (`id`, `userid`, `postid`, `time`, `messageContent`, `addone`, `addtwo`) VALUES
(1, 1, 1, '2019-12-17 16:58:48', '垃圾游戏，回我青春', NULL, NULL),
(2, 1, 7, '2019-12-17 16:59:18', '垃圾游戏，回我青春', NULL, NULL),
(3, 1, 3, '2019-12-17 16:59:23', '垃圾游戏，回我青春', NULL, NULL),
(4, 1, 7, '2019-12-17 16:59:51', '垃圾游戏，回我青春，emmmm', NULL, NULL),
(5, 1, 7, '2019-12-17 17:16:51', '垃圾游戏，回我青春，emmmm，123123', NULL, NULL),
(6, 1, 7, '2019-12-17 17:38:30', '垃圾游戏，回我青春，emmmm，123123', NULL, NULL),
(7, 1, 6, '2019-12-17 17:38:55', '垃圾游戏，回我青春，emmmm，123123', NULL, NULL),
(8, 1, 6, '2019-12-17 17:39:03', '垃圾游戏，回我青春，emmmm，123123', NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `posts`
--

CREATE TABLE `posts` (
  `id` int(11) NOT NULL,
  `url` varchar(255) NOT NULL,
  `topic` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `content` varchar(1023) NOT NULL,
  `userid` int(11) NOT NULL,
  `gameid` int(11) NOT NULL,
  `msgnum` int(11) NOT NULL DEFAULT '0',
  `praisenum` int(11) NOT NULL DEFAULT '0',
  `follownum` int(11) NOT NULL DEFAULT '0',
  `addone` int(11) DEFAULT NULL,
  `addtwo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `posts`
--

INSERT INTO `posts` (`id`, `url`, `topic`, `time`, `content`, `userid`, `gameid`, `msgnum`, `praisenum`, `follownum`, `addone`, `addtwo`) VALUES
(1, 'need to be replace', '王者荣耀', '2019-12-16 20:12:16', '这个游戏真垃圾', 1, 1, 1, 0, 2, NULL, NULL),
(2, 'need to be replace', '王者荣耀', '2019-12-16 20:12:54', '这个游戏真好玩', 1, 1, 0, 0, 0, NULL, NULL),
(3, 'need to be replace', '王者荣耀', '2019-12-16 20:12:55', '这个游戏真好玩', 1, 1, 1, 0, 0, NULL, NULL),
(4, 'need to be replace', '刺激战场', '2019-12-16 20:39:57', '这个游戏真好玩', 2, 2, 0, 0, 0, NULL, NULL),
(5, 'need to be replace', '刺激战场', '2019-12-16 20:40:10', '这个游戏真垃圾', 2, 2, 0, 1, 1, NULL, NULL),
(6, 'need to be replace', '刺激战场', '2019-12-16 20:49:46', '这个游戏真香', 1, 2, 2, 0, 1, NULL, NULL),
(7, 'need to be replace', '刺激战场', '2019-12-16 20:50:09', '这个游戏真香啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊', 1, 2, 4, 2, 2, NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `reply`
--

CREATE TABLE `reply` (
  `id` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `messageid` int(11) NOT NULL,
  `time` datetime DEFAULT NULL,
  `replycontent` varchar(1023) DEFAULT NULL,
  `addone` int(11) DEFAULT NULL,
  `addtwo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `reply`
--

INSERT INTO `reply` (`id`, `userid`, `messageid`, `time`, `replycontent`, `addone`, `addtwo`) VALUES
(1, 1, 1, '2019-12-17 17:00:55', '友军友军', NULL, NULL),
(2, 1, 1, '2019-12-17 19:03:14', '友军友军，我顶', NULL, NULL),
(3, 2, 1, '2019-12-17 19:03:38', '友军友军，我顶', NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `phonenum` varchar(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `headpic` varchar(255) NOT NULL,
  `addone` int(11) DEFAULT NULL,
  `addtwo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `user`
--

INSERT INTO `user` (`id`, `username`, `phonenum`, `email`, `password`, `headpic`, `addone`, `addtwo`) VALUES
(1, 'mail', '12345678', 'mail@123', '123456', 'default.jpg', NULL, NULL),
(2, 'chen', '12345', 'chen@123', '123456', 'default.jpg', NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `userfollowgames`
--

CREATE TABLE `userfollowgames` (
  `gameid` int(11) NOT NULL,
  `userid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `userfollowgames`
--

INSERT INTO `userfollowgames` (`gameid`, `userid`) VALUES
(1, 1),
(2, 1),
(3, 1),
(6, 1),
(1, 2);

-- --------------------------------------------------------

--
-- 表的结构 `userfollowposts`
--

CREATE TABLE `userfollowposts` (
  `postid` int(11) NOT NULL,
  `userid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `userfollowposts`
--

INSERT INTO `userfollowposts` (`postid`, `userid`) VALUES
(1, 1),
(1, 2),
(7, 2),
(6, 2),
(5, 1),
(7, 1);

-- --------------------------------------------------------

--
-- 表的结构 `userplaysgames`
--

CREATE TABLE `userplaysgames` (
  `id` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `gameid` int(11) NOT NULL,
  `lastplaytime` datetime NOT NULL,
  `addone` int(11) DEFAULT NULL,
  `addtwo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `userplaysgames`
--

INSERT INTO `userplaysgames` (`id`, `userid`, `gameid`, `lastplaytime`, `addone`, `addtwo`) VALUES
(1, 1, 1, '2019-12-16 19:47:29', NULL, NULL),
(2, 1, 2, '2019-12-16 20:49:09', NULL, NULL),
(3, 1, 3, '2019-12-16 19:48:18', NULL, NULL),
(4, 2, 9, '2019-12-16 20:43:36', NULL, NULL),
(5, 1, 9, '2019-12-16 20:48:57', NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `userpraisemsg`
--

CREATE TABLE `userpraisemsg` (
  `userid` int(11) NOT NULL,
  `messageid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `userpraiseposts`
--

CREATE TABLE `userpraiseposts` (
  `userid` int(11) NOT NULL,
  `postid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `userpraiseposts`
--

INSERT INTO `userpraiseposts` (`userid`, `postid`) VALUES
(2, 7),
(1, 5),
(1, 7);

--
-- 转储表的索引
--

--
-- 表的索引 `games`
--
ALTER TABLE `games`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `message`
--
ALTER TABLE `message`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `reply`
--
ALTER TABLE `reply`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `userplaysgames`
--
ALTER TABLE `userplaysgames`
  ADD PRIMARY KEY (`id`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `games`
--
ALTER TABLE `games`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- 使用表AUTO_INCREMENT `message`
--
ALTER TABLE `message`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- 使用表AUTO_INCREMENT `posts`
--
ALTER TABLE `posts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- 使用表AUTO_INCREMENT `reply`
--
ALTER TABLE `reply`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- 使用表AUTO_INCREMENT `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- 使用表AUTO_INCREMENT `userplaysgames`
--
ALTER TABLE `userplaysgames`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
