package com.andy.games.add

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andy.games.search.SearchRepository
import kotlinx.coroutines.launch
import timber.log.Timber

class AddGameViewModel @ViewModelInject constructor(
    val searchRepository: SearchRepository
) : ViewModel() {

    var text: String = ""

    fun search() {

        viewModelScope.launch {
            val response = searchRepository.search(text)
            Timber.e("AAA $response")
        }

    }
}


/*
{
	"count": 2065,
	"next": "https://api.rawg.io/api/games?key=2f2dfb763b2e4802b453d79fcb46cc5d&page=2&search=just+cause",
	"previous": null,
	"results": [{
		"slug": "just-cause",
		"name": "Just Cause",
		"playtime": 1,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 14,
				"name": "Xbox 360",
				"slug": "xbox360"
			}
		}, {
			"platform": {
				"id": 15,
				"name": "PlayStation 2",
				"slug": "playstation2"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}, {
			"store": {
				"id": 7,
				"name": "Xbox 360 Store",
				"slug": "xbox360"
			}
		}],
		"released": "2006-09-26",
		"tba": false,
		"background_image": "https://media.rawg.io/media/games/e60/e601c02ec49ef4f1d5ef147994b3935f.jpg",
		"rating": 3.34,
		"rating_top": 4,
		"ratings": [{
			"id": 4,
			"title": "recommended",
			"count": 137,
			"percent": 48.75
		}, {
			"id": 3,
			"title": "meh",
			"count": 103,
			"percent": 36.65
		}, {
			"id": 1,
			"title": "skip",
			"count": 31,
			"percent": 11.03
		}, {
			"id": 5,
			"title": "exceptional",
			"count": 10,
			"percent": 3.56
		}],
		"ratings_count": 280,
		"reviews_text_count": 1,
		"added": 2579,
		"added_by_status": {
			"yet": 124,
			"owned": 2098,
			"beaten": 182,
			"toplay": 15,
			"dropped": 152,
			"playing": 8
		},
		"metacritic": 75,
		"suggestions_count": 553,
		"updated": "2019-09-17T03:26:34",
		"id": 19685,
		"score": "71.706436",
		"clip": null,
		"tags": [{
			"id": 31,
			"name": "Singleplayer",
			"slug": "singleplayer",
			"language": "eng",
			"games_count": 96950,
			"image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
		}, {
			"id": 42396,
			"name": "Для одного игрока",
			"slug": "dlia-odnogo-igroka",
			"language": "rus",
			"games_count": 13220,
			"image_background": "https://media.rawg.io/media/games/588/588c6bdff3d4baf66ec36b1c05b793bf.jpg"
		}, {
			"id": 42417,
			"name": "Экшен",
			"slug": "ekshen",
			"language": "rus",
			"games_count": 20656,
			"image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
		}, {
			"id": 42392,
			"name": "Приключение",
			"slug": "prikliuchenie",
			"language": "rus",
			"games_count": 18657,
			"image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
		}, {
			"id": 7,
			"name": "Multiplayer",
			"slug": "multiplayer",
			"language": "eng",
			"games_count": 23130,
			"image_background": "https://media.rawg.io/media/games/1bb/1bb86c35ffa3eb0d299b01a7c65bf908.jpg"
		}, {
			"id": 13,
			"name": "Atmospheric",
			"slug": "atmospheric",
			"language": "eng",
			"games_count": 10910,
			"image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
		}, {
			"id": 42400,
			"name": "Атмосфера",
			"slug": "atmosfera",
			"language": "rus",
			"games_count": 5107,
			"image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
		}, {
			"id": 42425,
			"name": "Для нескольких игроков",
			"slug": "dlia-neskolkikh-igrokov",
			"language": "rus",
			"games_count": 4496,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42401,
			"name": "Отличный саундтрек",
			"slug": "otlichnyi-saundtrek",
			"language": "rus",
			"games_count": 4331,
			"image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
		}, {
			"id": 36,
			"name": "Open World",
			"slug": "open-world",
			"language": "eng",
			"games_count": 3258,
			"image_background": "https://media.rawg.io/media/games/9aa/9aa42d16d425fa6f179fc9dc2f763647.jpg"
		}, {
			"id": 42442,
			"name": "Открытый мир",
			"slug": "otkrytyi-mir",
			"language": "rus",
			"games_count": 2337,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42435,
			"name": "Шедевр",
			"slug": "shedevr",
			"language": "rus",
			"games_count": 1058,
			"image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
		}, {
			"id": 42428,
			"name": "Шутер",
			"slug": "shuter",
			"language": "rus",
			"games_count": 2952,
			"image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
		}, {
			"id": 149,
			"name": "Third Person",
			"slug": "third-person",
			"language": "eng",
			"games_count": 3359,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42441,
			"name": "От третьего лица",
			"slug": "ot-tretego-litsa",
			"language": "rus",
			"games_count": 1589,
			"image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
		}, {
			"id": 42461,
			"name": "Классика",
			"slug": "klassika",
			"language": "rus",
			"games_count": 1323,
			"image_background": "https://media.rawg.io/media/games/9c4/9c47f320eb73c9a02d462e12f6206b26.jpg"
		}, {
			"id": 193,
			"name": "Classic",
			"slug": "classic",
			"language": "eng",
			"games_count": 1525,
			"image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
		}, {
			"id": 37,
			"name": "Sandbox",
			"slug": "sandbox",
			"language": "eng",
			"games_count": 3008,
			"image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
		}, {
			"id": 42444,
			"name": "Песочница",
			"slug": "pesochnitsa",
			"language": "rus",
			"games_count": 1586,
			"image_background": "https://media.rawg.io/media/games/c22/c22d804ac753c72f2617b3708a625dec.jpg"
		}, {
			"id": 42416,
			"name": "Контроллер",
			"slug": "kontroller",
			"language": "rus",
			"games_count": 1061,
			"image_background": "https://media.rawg.io/media/games/04a/04a7e7e185fb51493bdcbe1693a8b3dc.jpg"
		}, {
			"id": 42446,
			"name": "Шутер от третьего лица",
			"slug": "shuter-ot-tretego-litsa",
			"language": "rus",
			"games_count": 581,
			"image_background": "https://media.rawg.io/media/games/d7d/d7d33daa1892e2468cd0263d5dfc957e.jpg"
		}, {
			"id": 150,
			"name": "Third-Person Shooter",
			"slug": "third-person-shooter",
			"language": "eng",
			"games_count": 1233,
			"image_background": "https://media.rawg.io/media/games/10d/10d19e52e5e8415d16a4d344fe711874.jpg"
		}],
		"esrb_rating": {
			"id": 4,
			"name": "Mature",
			"slug": "mature",
			"name_en": "Mature",
			"name_ru": "С 17 лет"
		},
		"user_game": null,
		"reviews_count": 281,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/games/e60/e601c02ec49ef4f1d5ef147994b3935f.jpg"
		}, {
			"id": 185492,
			"image": "https://media.rawg.io/media/screenshots/95e/95ec507c456d78a46031a4b3a852d7a9.jpg"
		}, {
			"id": 185493,
			"image": "https://media.rawg.io/media/screenshots/72e/72e9f448540dd0349a0c0b9994fe67ee.jpg"
		}, {
			"id": 185494,
			"image": "https://media.rawg.io/media/screenshots/ae5/ae57b70598ac4704183397c54c8b4540.jpg"
		}, {
			"id": 185495,
			"image": "https://media.rawg.io/media/screenshots/d78/d783de22559c4a8be122942b8beca79a.jpg"
		}, {
			"id": 185496,
			"image": "https://media.rawg.io/media/screenshots/7e1/7e1f8b191228e0dbc78d8cb50f1be7e0.jpg"
		}, {
			"id": 185497,
			"image": "https://media.rawg.io/media/screenshots/20a/20a94c08e2133f1b2686476af0f23ae5.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 2,
				"name": "PlayStation",
				"slug": "playstation"
			}
		}, {
			"platform": {
				"id": 3,
				"name": "Xbox",
				"slug": "xbox"
			}
		}],
		"genres": [{
			"id": 2,
			"name": "Shooter",
			"slug": "shooter"
		}, {
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-4",
		"name": "Just Cause 4",
		"playtime": 5,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 1,
				"name": "Xbox One",
				"slug": "xbox-one"
			}
		}, {
			"platform": {
				"id": 18,
				"name": "PlayStation 4",
				"slug": "playstation4"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}, {
			"store": {
				"id": 3,
				"name": "PlayStation Store",
				"slug": "playstation-store"
			}
		}, {
			"store": {
				"id": 2,
				"name": "Xbox Store",
				"slug": "xbox-store"
			}
		}, {
			"store": {
				"id": 11,
				"name": "Epic Games",
				"slug": "epic-games"
			}
		}],
		"released": "2018-12-04",
		"tba": false,
		"background_image": "https://media.rawg.io/media/games/02a/02a7f96f5a1156642bc0f827fd1b63f0.jpg",
		"rating": 3.02,
		"rating_top": 3,
		"ratings": [{
			"id": 3,
			"title": "meh",
			"count": 123,
			"percent": 47.31
		}, {
			"id": 4,
			"title": "recommended",
			"count": 72,
			"percent": 27.69
		}, {
			"id": 1,
			"title": "skip",
			"count": 49,
			"percent": 18.85
		}, {
			"id": 5,
			"title": "exceptional",
			"count": 16,
			"percent": 6.15
		}],
		"ratings_count": 258,
		"reviews_text_count": 2,
		"added": 1456,
		"added_by_status": {
			"yet": 134,
			"owned": 976,
			"beaten": 72,
			"toplay": 119,
			"dropped": 133,
			"playing": 22
		},
		"metacritic": 68,
		"suggestions_count": 585,
		"updated": "2020-04-09T15:09:39",
		"id": 58698,
		"score": "49.765953",
		"clip": null,
		"tags": [{
			"id": 31,
			"name": "Singleplayer",
			"slug": "singleplayer",
			"language": "eng",
			"games_count": 96950,
			"image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
		}, {
			"id": 42396,
			"name": "Для одного игрока",
			"slug": "dlia-odnogo-igroka",
			"language": "rus",
			"games_count": 13220,
			"image_background": "https://media.rawg.io/media/games/588/588c6bdff3d4baf66ec36b1c05b793bf.jpg"
		}, {
			"id": 42417,
			"name": "Экшен",
			"slug": "ekshen",
			"language": "rus",
			"games_count": 20656,
			"image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
		}, {
			"id": 42392,
			"name": "Приключение",
			"slug": "prikliuchenie",
			"language": "rus",
			"games_count": 18657,
			"image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
		}, {
			"id": 40847,
			"name": "Steam Achievements",
			"slug": "steam-achievements",
			"language": "eng",
			"games_count": 20335,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 7808,
			"name": "steam-trading-cards",
			"slug": "steam-trading-cards",
			"language": "eng",
			"games_count": 7604,
			"image_background": "https://media.rawg.io/media/games/55e/55ee6432ac2bf224610fa17e4c652107.jpg"
		}, {
			"id": 13,
			"name": "Atmospheric",
			"slug": "atmospheric",
			"language": "eng",
			"games_count": 10910,
			"image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
		}, {
			"id": 42400,
			"name": "Атмосфера",
			"slug": "atmosfera",
			"language": "rus",
			"games_count": 5107,
			"image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
		}, {
			"id": 40836,
			"name": "Full controller support",
			"slug": "full-controller-support",
			"language": "eng",
			"games_count": 9571,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 42394,
			"name": "Глубокий сюжет",
			"slug": "glubokii-siuzhet",
			"language": "rus",
			"games_count": 3841,
			"image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
		}, {
			"id": 118,
			"name": "Story Rich",
			"slug": "story-rich",
			"language": "eng",
			"games_count": 8330,
			"image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
		}, {
			"id": 36,
			"name": "Open World",
			"slug": "open-world",
			"language": "eng",
			"games_count": 3258,
			"image_background": "https://media.rawg.io/media/games/9aa/9aa42d16d425fa6f179fc9dc2f763647.jpg"
		}, {
			"id": 411,
			"name": "cooperative",
			"slug": "cooperative",
			"language": "eng",
			"games_count": 2565,
			"image_background": "https://media.rawg.io/media/games/15c/15c95a4915f88a3e89c821526afe05fc.jpg"
		}, {
			"id": 42442,
			"name": "Открытый мир",
			"slug": "otkrytyi-mir",
			"language": "rus",
			"games_count": 2337,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42428,
			"name": "Шутер",
			"slug": "shuter",
			"language": "rus",
			"games_count": 2952,
			"image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
		}, {
			"id": 42427,
			"name": "Шутер от первого лица",
			"slug": "shuter-ot-pervogo-litsa",
			"language": "rus",
			"games_count": 2083,
			"image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
		}, {
			"id": 42482,
			"name": "Смешная",
			"slug": "smeshnaia",
			"language": "rus",
			"games_count": 3128,
			"image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
		}, {
			"id": 42491,
			"name": "Мясо",
			"slug": "miaso",
			"language": "rus",
			"games_count": 2840,
			"image_background": "https://media.rawg.io/media/games/1f1/1f1888e1308959dfd3be4c144a81d19c.jpg"
		}, {
			"id": 26,
			"name": "Gore",
			"slug": "gore",
			"language": "eng",
			"games_count": 3516,
			"image_background": "https://media.rawg.io/media/screenshots/f2f/f2f3c93d6153da7aee590f3ab8ccd803.jpg"
		}, {
			"id": 37,
			"name": "Sandbox",
			"slug": "sandbox",
			"language": "eng",
			"games_count": 3008,
			"image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
		}, {
			"id": 42444,
			"name": "Песочница",
			"slug": "pesochnitsa",
			"language": "rus",
			"games_count": 1586,
			"image_background": "https://media.rawg.io/media/games/c22/c22d804ac753c72f2617b3708a625dec.jpg"
		}, {
			"id": 42402,
			"name": "Насилие",
			"slug": "nasilie",
			"language": "rus",
			"games_count": 3416,
			"image_background": "https://media.rawg.io/media/games/7f0/7f021d4a3577ac9d591a628a431fc2e5.jpg"
		}, {
			"id": 34,
			"name": "Violent",
			"slug": "violent",
			"language": "eng",
			"games_count": 4145,
			"image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
		}, {
			"id": 42446,
			"name": "Шутер от третьего лица",
			"slug": "shuter-ot-tretego-litsa",
			"language": "rus",
			"games_count": 581,
			"image_background": "https://media.rawg.io/media/games/d7d/d7d33daa1892e2468cd0263d5dfc957e.jpg"
		}, {
			"id": 150,
			"name": "Third-Person Shooter",
			"slug": "third-person-shooter",
			"language": "eng",
			"games_count": 1233,
			"image_background": "https://media.rawg.io/media/games/10d/10d19e52e5e8415d16a4d344fe711874.jpg"
		}, {
			"id": 69,
			"name": "Action-Adventure",
			"slug": "action-adventure",
			"language": "eng",
			"games_count": 6592,
			"image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
		}, {
			"id": 42407,
			"name": "Аниме",
			"slug": "anime-2",
			"language": "rus",
			"games_count": 3164,
			"image_background": "https://media.rawg.io/media/games/556/556157feed9ee1f55f2b12b2973e30a3.jpg"
		}, {
			"id": 114,
			"name": "Physics",
			"slug": "physics",
			"language": "eng",
			"games_count": 11218,
			"image_background": "https://media.rawg.io/media/games/6fd/6fd971ffa72faa1758960d25ef6196bc.jpg"
		}, {
			"id": 42500,
			"name": "Физика",
			"slug": "fizika",
			"language": "rus",
			"games_count": 1373,
			"image_background": "https://media.rawg.io/media/screenshots/eef/eef872fddedf40e6d2236bb981725cc6.jpg"
		}, {
			"id": 42490,
			"name": "Приключенческий экшен",
			"slug": "prikliuchencheskii-ekshen",
			"language": "rus",
			"games_count": 1272,
			"image_background": "https://media.rawg.io/media/games/af7/af7a831001c5c32c46e950cc883b8cb7.jpg"
		}, {
			"id": 478,
			"name": "3rd-Person Perspective",
			"slug": "3rd-person-perspective",
			"language": "eng",
			"games_count": 81,
			"image_background": "https://media.rawg.io/media/games/709/709bf81f874ce5d25d625b37b014cb63.jpg"
		}, {
			"id": 42600,
			"name": "Вождение",
			"slug": "vozhdenie",
			"language": "rus",
			"games_count": 483,
			"image_background": "https://media.rawg.io/media/games/d7d/d7d33daa1892e2468cd0263d5dfc957e.jpg"
		}, {
			"id": 51,
			"name": "Destruction",
			"slug": "destruction",
			"language": "eng",
			"games_count": 2255,
			"image_background": "https://media.rawg.io/media/games/370/3703c683968a54f09630dcf03366ea35.jpg"
		}, {
			"id": 42560,
			"name": "Разрушения",
			"slug": "razrusheniia",
			"language": "rus",
			"games_count": 351,
			"image_background": "https://media.rawg.io/media/screenshots/18c/18c0bf89ecef8170cdd97075dbbadded.jpg"
		}, {
			"id": 42447,
			"name": "Ограбления",
			"slug": "ogrableniia",
			"language": "rus",
			"games_count": 81,
			"image_background": "https://media.rawg.io/media/games/2ed/2ed38a102fe66a0ea98a8e09c660a458.jpg"
		}],
		"esrb_rating": {
			"id": 4,
			"name": "Mature",
			"slug": "mature",
			"name_en": "Mature",
			"name_ru": "С 17 лет"
		},
		"user_game": null,
		"reviews_count": 260,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/games/02a/02a7f96f5a1156642bc0f827fd1b63f0.jpg"
		}, {
			"id": 778817,
			"image": "https://media.rawg.io/media/screenshots/0d5/0d526db510d0e3f3d3ad9fe1261ff8d4.jpg"
		}, {
			"id": 778818,
			"image": "https://media.rawg.io/media/screenshots/7ed/7ed036fb9e3f4a0693aeac1802b29b5f.jpg"
		}, {
			"id": 778819,
			"image": "https://media.rawg.io/media/screenshots/bd1/bd18edd1948d78c2bf9cd29b232e1d16.jpg"
		}, {
			"id": 778820,
			"image": "https://media.rawg.io/media/screenshots/b70/b70831533eb12c6cd108a4ac9c2c267e.jpg"
		}, {
			"id": 779083,
			"image": "https://media.rawg.io/media/screenshots/476/4768bcd9ea21b2520c41bfd286918881.jpg"
		}, {
			"id": 779084,
			"image": "https://media.rawg.io/media/screenshots/d19/d191bee5ef3b5ae389b41ab2436b8b12.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 2,
				"name": "PlayStation",
				"slug": "playstation"
			}
		}, {
			"platform": {
				"id": 3,
				"name": "Xbox",
				"slug": "xbox"
			}
		}],
		"genres": [{
			"id": 3,
			"name": "Adventure",
			"slug": "adventure"
		}, {
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-3-multiplayer-mod",
		"name": "Just Cause 3: Multiplayer Mod",
		"playtime": 1,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}],
		"released": "2017-07-20",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/ba8/ba8fc30d38ad2d60f5e73d82ca3e9b5f.jpg",
		"rating": 2.66,
		"rating_top": 1,
		"ratings": [{
			"id": 1,
			"title": "skip",
			"count": 16,
			"percent": 36.36
		}, {
			"id": 4,
			"title": "recommended",
			"count": 13,
			"percent": 29.55
		}, {
			"id": 3,
			"title": "meh",
			"count": 13,
			"percent": 29.55
		}, {
			"id": 5,
			"title": "exceptional",
			"count": 2,
			"percent": 4.55
		}],
		"ratings_count": 44,
		"reviews_text_count": 0,
		"added": 456,
		"added_by_status": {
			"yet": 15,
			"owned": 398,
			"beaten": 5,
			"toplay": 4,
			"dropped": 33,
			"playing": 1
		},
		"metacritic": null,
		"suggestions_count": 360,
		"updated": "2019-09-17T06:14:57",
		"id": 44469,
		"score": "44.046295",
		"clip": null,
		"tags": [{
			"id": 42417,
			"name": "Экшен",
			"slug": "ekshen",
			"language": "rus",
			"games_count": 20656,
			"image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
		}, {
			"id": 7,
			"name": "Multiplayer",
			"slug": "multiplayer",
			"language": "eng",
			"games_count": 23130,
			"image_background": "https://media.rawg.io/media/games/1bb/1bb86c35ffa3eb0d299b01a7c65bf908.jpg"
		}, {
			"id": 42425,
			"name": "Для нескольких игроков",
			"slug": "dlia-neskolkikh-igrokov",
			"language": "rus",
			"games_count": 4496,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 36,
			"name": "Open World",
			"slug": "open-world",
			"language": "eng",
			"games_count": 3258,
			"image_background": "https://media.rawg.io/media/games/9aa/9aa42d16d425fa6f179fc9dc2f763647.jpg"
		}, {
			"id": 411,
			"name": "cooperative",
			"slug": "cooperative",
			"language": "eng",
			"games_count": 2565,
			"image_background": "https://media.rawg.io/media/games/15c/15c95a4915f88a3e89c821526afe05fc.jpg"
		}, {
			"id": 42442,
			"name": "Открытый мир",
			"slug": "otkrytyi-mir",
			"language": "rus",
			"games_count": 2337,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42428,
			"name": "Шутер",
			"slug": "shuter",
			"language": "rus",
			"games_count": 2952,
			"image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
		}, {
			"id": 40845,
			"name": "Partial Controller Support",
			"slug": "partial-controller-support",
			"language": "eng",
			"games_count": 6892,
			"image_background": "https://media.rawg.io/media/games/713/713269608dc8f2f40f5a670a14b2de94.jpg"
		}, {
			"id": 42441,
			"name": "От третьего лица",
			"slug": "ot-tretego-litsa",
			"language": "rus",
			"games_count": 1589,
			"image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
		}, {
			"id": 42482,
			"name": "Смешная",
			"slug": "smeshnaia",
			"language": "rus",
			"games_count": 3128,
			"image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
		}, {
			"id": 42444,
			"name": "Песочница",
			"slug": "pesochnitsa",
			"language": "rus",
			"games_count": 1586,
			"image_background": "https://media.rawg.io/media/games/c22/c22d804ac753c72f2617b3708a625dec.jpg"
		}, {
			"id": 79,
			"name": "Free to Play",
			"slug": "free-to-play",
			"language": "eng",
			"games_count": 3466,
			"image_background": "https://media.rawg.io/media/games/98c/98cd77a9f61b31a6ddab1670b079c841.jpg"
		}, {
			"id": 42538,
			"name": "Бесплатная игра",
			"slug": "besplatnaia-igra",
			"language": "rus",
			"games_count": 3463,
			"image_background": "https://media.rawg.io/media/games/26b/26b27e1da9e3727fcb12e3e4e86c8c19.jpg"
		}, {
			"id": 42402,
			"name": "Насилие",
			"slug": "nasilie",
			"language": "rus",
			"games_count": 3416,
			"image_background": "https://media.rawg.io/media/games/7f0/7f021d4a3577ac9d591a628a431fc2e5.jpg"
		}, {
			"id": 397,
			"name": "Online multiplayer",
			"slug": "online-multiplayer",
			"language": "eng",
			"games_count": 3794,
			"image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
		}, {
			"id": 34,
			"name": "Violent",
			"slug": "violent",
			"language": "eng",
			"games_count": 4145,
			"image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
		}, {
			"id": 42446,
			"name": "Шутер от третьего лица",
			"slug": "shuter-ot-tretego-litsa",
			"language": "rus",
			"games_count": 581,
			"image_background": "https://media.rawg.io/media/games/d7d/d7d33daa1892e2468cd0263d5dfc957e.jpg"
		}, {
			"id": 150,
			"name": "Third-Person Shooter",
			"slug": "third-person-shooter",
			"language": "eng",
			"games_count": 1233,
			"image_background": "https://media.rawg.io/media/games/10d/10d19e52e5e8415d16a4d344fe711874.jpg"
		}, {
			"id": 42453,
			"name": "ММО",
			"slug": "mmo-2",
			"language": "rus",
			"games_count": 1557,
			"image_background": "https://media.rawg.io/media/games/d0f/d0f91fe1d92332147e5db74e207cfc7a.jpg"
		}, {
			"id": 1656,
			"name": "mmo",
			"slug": "mmo",
			"language": "eng",
			"games_count": 1099,
			"image_background": "https://media.rawg.io/media/screenshots/6d3/6d367773c06886535620f2d7fb1cb866.jpg"
		}, {
			"id": 244,
			"name": "Mod",
			"slug": "mod",
			"language": "eng",
			"games_count": 399,
			"image_background": "https://media.rawg.io/media/screenshots/78f/78f5eec9a91020e96a2f279ec366fc6b.jpg"
		}, {
			"id": 42557,
			"name": "Модификации",
			"slug": "modifikatsii",
			"language": "rus",
			"games_count": 50,
			"image_background": "https://media.rawg.io/media/screenshots/142/142e13c73bf0aaf247a0c771d41a6f91.jpg"
		}],
		"esrb_rating": {
			"id": 5,
			"name": "Adults Only",
			"slug": "adults-only",
			"name_en": "Adults Only",
			"name_ru": "Только для взрослых"
		},
		"user_game": null,
		"reviews_count": 44,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/ba8/ba8fc30d38ad2d60f5e73d82ca3e9b5f.jpg"
		}, {
			"id": 640918,
			"image": "https://media.rawg.io/media/screenshots/bb0/bb0b43980ff3eacefb04e678642df37c.jpg"
		}, {
			"id": 640919,
			"image": "https://media.rawg.io/media/screenshots/a6d/a6d819ae8b190b51ba6b9bc18778759e.jpg"
		}, {
			"id": 640920,
			"image": "https://media.rawg.io/media/screenshots/55d/55d041f4bdadc91c9539a7e8c2d59fbb.jpg"
		}, {
			"id": 640921,
			"image": "https://media.rawg.io/media/screenshots/9c1/9c14f87d144fcac1425777cd1b64319c.jpg"
		}, {
			"id": 640922,
			"image": "https://media.rawg.io/media/screenshots/351/351cc852e482c7bc6a6e09bf7b894bd8.jpg"
		}, {
			"id": 640923,
			"image": "https://media.rawg.io/media/screenshots/10d/10d6d328ed2fc7e1ae633063fe4a05d5.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 59,
			"name": "Massively Multiplayer",
			"slug": "massively-multiplayer"
		}, {
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-2-multiplayer-mod",
		"name": "Just Cause 2: Multiplayer Mod",
		"playtime": 2,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}],
		"released": "2013-12-16",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/0fd/0fd83a4e2b6824d3edaf6c2be2e168e6.jpg",
		"rating": 3.37,
		"rating_top": 4,
		"ratings": [{
			"id": 4,
			"title": "recommended",
			"count": 111,
			"percent": 51.39
		}, {
			"id": 3,
			"title": "meh",
			"count": 61,
			"percent": 28.24
		}, {
			"id": 1,
			"title": "skip",
			"count": 30,
			"percent": 13.89
		}, {
			"id": 5,
			"title": "exceptional",
			"count": 14,
			"percent": 6.48
		}],
		"ratings_count": 215,
		"reviews_text_count": 1,
		"added": 1359,
		"added_by_status": {
			"yet": 22,
			"owned": 1167,
			"beaten": 41,
			"toplay": 4,
			"dropped": 122,
			"playing": 3
		},
		"metacritic": null,
		"suggestions_count": 407,
		"updated": "2019-09-17T03:58:42",
		"id": 14827,
		"score": "43.359074",
		"clip": null,
		"tags": [{
			"id": 31,
			"name": "Singleplayer",
			"slug": "singleplayer",
			"language": "eng",
			"games_count": 96950,
			"image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
		}, {
			"id": 42396,
			"name": "Для одного игрока",
			"slug": "dlia-odnogo-igroka",
			"language": "rus",
			"games_count": 13220,
			"image_background": "https://media.rawg.io/media/games/588/588c6bdff3d4baf66ec36b1c05b793bf.jpg"
		}, {
			"id": 42417,
			"name": "Экшен",
			"slug": "ekshen",
			"language": "rus",
			"games_count": 20656,
			"image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
		}, {
			"id": 42392,
			"name": "Приключение",
			"slug": "prikliuchenie",
			"language": "rus",
			"games_count": 18657,
			"image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
		}, {
			"id": 40847,
			"name": "Steam Achievements",
			"slug": "steam-achievements",
			"language": "eng",
			"games_count": 20335,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 7,
			"name": "Multiplayer",
			"slug": "multiplayer",
			"language": "eng",
			"games_count": 23130,
			"image_background": "https://media.rawg.io/media/games/1bb/1bb86c35ffa3eb0d299b01a7c65bf908.jpg"
		}, {
			"id": 42425,
			"name": "Для нескольких игроков",
			"slug": "dlia-neskolkikh-igrokov",
			"language": "rus",
			"games_count": 4496,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 18,
			"name": "Co-op",
			"slug": "co-op",
			"language": "eng",
			"games_count": 6051,
			"image_background": "https://media.rawg.io/media/games/83f/83f6f70a7c1b86cd2637b029d8b42caa.jpg"
		}, {
			"id": 36,
			"name": "Open World",
			"slug": "open-world",
			"language": "eng",
			"games_count": 3258,
			"image_background": "https://media.rawg.io/media/games/9aa/9aa42d16d425fa6f179fc9dc2f763647.jpg"
		}, {
			"id": 411,
			"name": "cooperative",
			"slug": "cooperative",
			"language": "eng",
			"games_count": 2565,
			"image_background": "https://media.rawg.io/media/games/15c/15c95a4915f88a3e89c821526afe05fc.jpg"
		}, {
			"id": 42442,
			"name": "Открытый мир",
			"slug": "otkrytyi-mir",
			"language": "rus",
			"games_count": 2337,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42428,
			"name": "Шутер",
			"slug": "shuter",
			"language": "rus",
			"games_count": 2952,
			"image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
		}, {
			"id": 149,
			"name": "Third Person",
			"slug": "third-person",
			"language": "eng",
			"games_count": 3359,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 40845,
			"name": "Partial Controller Support",
			"slug": "partial-controller-support",
			"language": "eng",
			"games_count": 6892,
			"image_background": "https://media.rawg.io/media/games/713/713269608dc8f2f40f5a670a14b2de94.jpg"
		}, {
			"id": 42441,
			"name": "От третьего лица",
			"slug": "ot-tretego-litsa",
			"language": "rus",
			"games_count": 1589,
			"image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
		}, {
			"id": 30,
			"name": "FPS",
			"slug": "fps",
			"language": "eng",
			"games_count": 6530,
			"image_background": "https://media.rawg.io/media/games/7a2/7a2500ee8b2c0e1ff268bb4479463dea.jpg"
		}, {
			"id": 42427,
			"name": "Шутер от первого лица",
			"slug": "shuter-ot-pervogo-litsa",
			"language": "rus",
			"games_count": 2083,
			"image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
		}, {
			"id": 42482,
			"name": "Смешная",
			"slug": "smeshnaia",
			"language": "rus",
			"games_count": 3128,
			"image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
		}, {
			"id": 4,
			"name": "Funny",
			"slug": "funny",
			"language": "eng",
			"games_count": 11209,
			"image_background": "https://media.rawg.io/media/games/10d/10d19e52e5e8415d16a4d344fe711874.jpg"
		}, {
			"id": 37,
			"name": "Sandbox",
			"slug": "sandbox",
			"language": "eng",
			"games_count": 3008,
			"image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
		}, {
			"id": 42444,
			"name": "Песочница",
			"slug": "pesochnitsa",
			"language": "rus",
			"games_count": 1586,
			"image_background": "https://media.rawg.io/media/games/c22/c22d804ac753c72f2617b3708a625dec.jpg"
		}, {
			"id": 6,
			"name": "Exploration",
			"slug": "exploration",
			"language": "eng",
			"games_count": 8470,
			"image_background": "https://media.rawg.io/media/games/c89/c89ca70716080733d03724277df2c6c7.jpg"
		}, {
			"id": 42464,
			"name": "Исследование",
			"slug": "issledovanie",
			"language": "rus",
			"games_count": 2167,
			"image_background": "https://media.rawg.io/media/games/a3c/a3c529a12c896c0ef02db5b4741de2ba.jpg"
		}, {
			"id": 79,
			"name": "Free to Play",
			"slug": "free-to-play",
			"language": "eng",
			"games_count": 3466,
			"image_background": "https://media.rawg.io/media/games/98c/98cd77a9f61b31a6ddab1670b079c841.jpg"
		}, {
			"id": 42538,
			"name": "Бесплатная игра",
			"slug": "besplatnaia-igra",
			"language": "rus",
			"games_count": 3463,
			"image_background": "https://media.rawg.io/media/games/26b/26b27e1da9e3727fcb12e3e4e86c8c19.jpg"
		}, {
			"id": 42446,
			"name": "Шутер от третьего лица",
			"slug": "shuter-ot-tretego-litsa",
			"language": "rus",
			"games_count": 581,
			"image_background": "https://media.rawg.io/media/games/d7d/d7d33daa1892e2468cd0263d5dfc957e.jpg"
		}, {
			"id": 150,
			"name": "Third-Person Shooter",
			"slug": "third-person-shooter",
			"language": "eng",
			"games_count": 1233,
			"image_background": "https://media.rawg.io/media/games/10d/10d19e52e5e8415d16a4d344fe711874.jpg"
		}, {
			"id": 62,
			"name": "Moddable",
			"slug": "moddable",
			"language": "eng",
			"games_count": 489,
			"image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
		}, {
			"id": 63,
			"name": "Zombies",
			"slug": "zombies",
			"language": "eng",
			"games_count": 6063,
			"image_background": "https://media.rawg.io/media/games/364/3642d850efb217c58feab80b8affaa89.jpg"
		}, {
			"id": 42438,
			"name": "Поддержка модификаций",
			"slug": "podderzhka-modifikatsii",
			"language": "rus",
			"games_count": 374,
			"image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
		}, {
			"id": 42544,
			"name": "Зомби",
			"slug": "zombi-2",
			"language": "rus",
			"games_count": 1034,
			"image_background": "https://media.rawg.io/media/games/f14/f1422eacab98c5f85a5123da4e9d9e89.jpg"
		}, {
			"id": 42453,
			"name": "ММО",
			"slug": "mmo-2",
			"language": "rus",
			"games_count": 1557,
			"image_background": "https://media.rawg.io/media/games/d0f/d0f91fe1d92332147e5db74e207cfc7a.jpg"
		}, {
			"id": 42496,
			"name": "Гонки",
			"slug": "gonki",
			"language": "rus",
			"games_count": 1796,
			"image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
		}, {
			"id": 42611,
			"name": "Эпичная",
			"slug": "epichnaia",
			"language": "rus",
			"games_count": 89,
			"image_background": "https://media.rawg.io/media/games/879/879c930f9c6787c920153fa2df452eb3.jpg"
		}, {
			"id": 244,
			"name": "Mod",
			"slug": "mod",
			"language": "eng",
			"games_count": 399,
			"image_background": "https://media.rawg.io/media/screenshots/78f/78f5eec9a91020e96a2f279ec366fc6b.jpg"
		}, {
			"id": 42557,
			"name": "Модификации",
			"slug": "modifikatsii",
			"language": "rus",
			"games_count": 50,
			"image_background": "https://media.rawg.io/media/screenshots/142/142e13c73bf0aaf247a0c771d41a6f91.jpg"
		}],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 216,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/0fd/0fd83a4e2b6824d3edaf6c2be2e168e6.jpg"
		}, {
			"id": 129985,
			"image": "https://media.rawg.io/media/screenshots/372/37213f37f03055b201767c912cec090e.jpg"
		}, {
			"id": 129986,
			"image": "https://media.rawg.io/media/screenshots/3e6/3e6ef43528d5dc2042f5238a61c5d47d.jpg"
		}, {
			"id": 129987,
			"image": "https://media.rawg.io/media/screenshots/39a/39a5f840c0c5aaa6948a06fc55a9a63f.jpg"
		}, {
			"id": 129988,
			"image": "https://media.rawg.io/media/screenshots/2e3/2e34fb06434b80ed32b6736d2624eed1.jpg"
		}, {
			"id": 129989,
			"image": "https://media.rawg.io/media/screenshots/2b9/2b9bd1f6bdb457a40418016306fdfcf0.jpg"
		}, {
			"id": 129990,
			"image": "https://media.rawg.io/media/screenshots/653/653bb2980f697ff05607632b96caf22c.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 3,
			"name": "Adventure",
			"slug": "adventure"
		}, {
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-mobile",
		"name": "Just Cause: Mobile",
		"playtime": 0,
		"platforms": [{
			"platform": {
				"id": 3,
				"name": "iOS",
				"slug": "ios"
			}
		}, {
			"platform": {
				"id": 21,
				"name": "Android",
				"slug": "android"
			}
		}],
		"stores": null,
		"released": null,
		"tba": true,
		"background_image": "https://media.rawg.io/media/games/ba2/ba28ecc6a59389dd3d299977a5a1b294.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [],
		"ratings_count": 0,
		"reviews_text_count": 0,
		"added": 0,
		"added_by_status": null,
		"metacritic": null,
		"suggestions_count": 0,
		"updated": "2020-12-14T10:42:26",
		"id": 532166,
		"score": "37.783157",
		"clip": null,
		"tags": [],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 0,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/games/ba2/ba28ecc6a59389dd3d299977a5a1b294.jpg"
		}, {
			"id": 2638314,
			"image": "https://media.rawg.io/media/screenshots/bd1/bd144bcccc620fffeef80337bf40972a.jpg"
		}, {
			"id": 2638315,
			"image": "https://media.rawg.io/media/screenshots/d57/d57d5314e497f7220494cfb5c9af4941.jpg"
		}, {
			"id": 2638316,
			"image": "https://media.rawg.io/media/screenshots/26f/26fba0810c429909efdd7fc7ea8271f3.jpg"
		}, {
			"id": 2638317,
			"image": "https://media.rawg.io/media/screenshots/6fc/6fcd8d980e4fadc72d55f5b2510ddc91.jpg"
		}, {
			"id": 2638318,
			"image": "https://media.rawg.io/media/screenshots/d66/d662a21b99be3d72049ca9c4acf537e8.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 4,
				"name": "iOS",
				"slug": "ios"
			}
		}, {
			"platform": {
				"id": 8,
				"name": "Android",
				"slug": "android"
			}
		}],
		"genres": [{
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-3",
		"name": "Just Cause 3",
		"playtime": 7,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 1,
				"name": "Xbox One",
				"slug": "xbox-one"
			}
		}, {
			"platform": {
				"id": 18,
				"name": "PlayStation 4",
				"slug": "playstation4"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}, {
			"store": {
				"id": 3,
				"name": "PlayStation Store",
				"slug": "playstation-store"
			}
		}, {
			"store": {
				"id": 2,
				"name": "Xbox Store",
				"slug": "xbox-store"
			}
		}],
		"released": "2015-11-30",
		"tba": false,
		"background_image": "https://media.rawg.io/media/games/5bb/5bb55ccb8205aadbb6a144cf6d8963f1.jpg",
		"rating": 3.32,
		"rating_top": 3,
		"ratings": [{
			"id": 3,
			"title": "meh",
			"count": 440,
			"percent": 40.89
		}, {
			"id": 4,
			"title": "recommended",
			"count": 432,
			"percent": 40.15
		}, {
			"id": 1,
			"title": "skip",
			"count": 123,
			"percent": 11.43
		}, {
			"id": 5,
			"title": "exceptional",
			"count": 81,
			"percent": 7.53
		}],
		"ratings_count": 1069,
		"reviews_text_count": 7,
		"added": 5794,
		"added_by_status": {
			"yet": 306,
			"owned": 4377,
			"beaten": 428,
			"toplay": 83,
			"dropped": 541,
			"playing": 59
		},
		"metacritic": 74,
		"suggestions_count": 636,
		"updated": "2020-03-08T19:28:31",
		"id": 3017,
		"score": "36.6988",
		"clip": null,
		"tags": [{
			"id": 31,
			"name": "Singleplayer",
			"slug": "singleplayer",
			"language": "eng",
			"games_count": 96950,
			"image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
		}, {
			"id": 42396,
			"name": "Для одного игрока",
			"slug": "dlia-odnogo-igroka",
			"language": "rus",
			"games_count": 13220,
			"image_background": "https://media.rawg.io/media/games/588/588c6bdff3d4baf66ec36b1c05b793bf.jpg"
		}, {
			"id": 42417,
			"name": "Экшен",
			"slug": "ekshen",
			"language": "rus",
			"games_count": 20656,
			"image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
		}, {
			"id": 42392,
			"name": "Приключение",
			"slug": "prikliuchenie",
			"language": "rus",
			"games_count": 18657,
			"image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
		}, {
			"id": 40847,
			"name": "Steam Achievements",
			"slug": "steam-achievements",
			"language": "eng",
			"games_count": 20335,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 7,
			"name": "Multiplayer",
			"slug": "multiplayer",
			"language": "eng",
			"games_count": 23130,
			"image_background": "https://media.rawg.io/media/games/1bb/1bb86c35ffa3eb0d299b01a7c65bf908.jpg"
		}, {
			"id": 7808,
			"name": "steam-trading-cards",
			"slug": "steam-trading-cards",
			"language": "eng",
			"games_count": 7604,
			"image_background": "https://media.rawg.io/media/games/55e/55ee6432ac2bf224610fa17e4c652107.jpg"
		}, {
			"id": 13,
			"name": "Atmospheric",
			"slug": "atmospheric",
			"language": "eng",
			"games_count": 10910,
			"image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
		}, {
			"id": 42400,
			"name": "Атмосфера",
			"slug": "atmosfera",
			"language": "rus",
			"games_count": 5107,
			"image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
		}, {
			"id": 42425,
			"name": "Для нескольких игроков",
			"slug": "dlia-neskolkikh-igrokov",
			"language": "rus",
			"games_count": 4496,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42401,
			"name": "Отличный саундтрек",
			"slug": "otlichnyi-saundtrek",
			"language": "rus",
			"games_count": 4331,
			"image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
		}, {
			"id": 40836,
			"name": "Full controller support",
			"slug": "full-controller-support",
			"language": "eng",
			"games_count": 9571,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 42,
			"name": "Great Soundtrack",
			"slug": "great-soundtrack",
			"language": "eng",
			"games_count": 3100,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 24,
			"name": "RPG",
			"slug": "rpg",
			"language": "eng",
			"games_count": 10812,
			"image_background": "https://media.rawg.io/media/games/588/588c6bdff3d4baf66ec36b1c05b793bf.jpg"
		}, {
			"id": 18,
			"name": "Co-op",
			"slug": "co-op",
			"language": "eng",
			"games_count": 6051,
			"image_background": "https://media.rawg.io/media/games/83f/83f6f70a7c1b86cd2637b029d8b42caa.jpg"
		}, {
			"id": 42412,
			"name": "Ролевая игра",
			"slug": "rolevaia-igra",
			"language": "rus",
			"games_count": 8253,
			"image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
		}, {
			"id": 36,
			"name": "Open World",
			"slug": "open-world",
			"language": "eng",
			"games_count": 3258,
			"image_background": "https://media.rawg.io/media/games/9aa/9aa42d16d425fa6f179fc9dc2f763647.jpg"
		}, {
			"id": 411,
			"name": "cooperative",
			"slug": "cooperative",
			"language": "eng",
			"games_count": 2565,
			"image_background": "https://media.rawg.io/media/games/15c/15c95a4915f88a3e89c821526afe05fc.jpg"
		}, {
			"id": 42442,
			"name": "Открытый мир",
			"slug": "otkrytyi-mir",
			"language": "rus",
			"games_count": 2337,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42428,
			"name": "Шутер",
			"slug": "shuter",
			"language": "rus",
			"games_count": 2952,
			"image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
		}, {
			"id": 149,
			"name": "Third Person",
			"slug": "third-person",
			"language": "eng",
			"games_count": 3359,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42441,
			"name": "От третьего лица",
			"slug": "ot-tretego-litsa",
			"language": "rus",
			"games_count": 1589,
			"image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
		}, {
			"id": 42482,
			"name": "Смешная",
			"slug": "smeshnaia",
			"language": "rus",
			"games_count": 3128,
			"image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
		}, {
			"id": 4,
			"name": "Funny",
			"slug": "funny",
			"language": "eng",
			"games_count": 11209,
			"image_background": "https://media.rawg.io/media/games/10d/10d19e52e5e8415d16a4d344fe711874.jpg"
		}, {
			"id": 42481,
			"name": "Юмор",
			"slug": "iumor",
			"language": "rus",
			"games_count": 1944,
			"image_background": "https://media.rawg.io/media/games/a3c/a3c529a12c896c0ef02db5b4741de2ba.jpg"
		}, {
			"id": 37,
			"name": "Sandbox",
			"slug": "sandbox",
			"language": "eng",
			"games_count": 3008,
			"image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
		}, {
			"id": 123,
			"name": "Comedy",
			"slug": "comedy",
			"language": "eng",
			"games_count": 5519,
			"image_background": "https://media.rawg.io/media/games/e3d/e3ddc524c6292a435d01d97cc5f42ea7.jpg"
		}, {
			"id": 42444,
			"name": "Песочница",
			"slug": "pesochnitsa",
			"language": "rus",
			"games_count": 1586,
			"image_background": "https://media.rawg.io/media/games/c22/c22d804ac753c72f2617b3708a625dec.jpg"
		}, {
			"id": 6,
			"name": "Exploration",
			"slug": "exploration",
			"language": "eng",
			"games_count": 8470,
			"image_background": "https://media.rawg.io/media/games/c89/c89ca70716080733d03724277df2c6c7.jpg"
		}, {
			"id": 42464,
			"name": "Исследование",
			"slug": "issledovanie",
			"language": "rus",
			"games_count": 2167,
			"image_background": "https://media.rawg.io/media/games/a3c/a3c529a12c896c0ef02db5b4741de2ba.jpg"
		}, {
			"id": 42446,
			"name": "Шутер от третьего лица",
			"slug": "shuter-ot-tretego-litsa",
			"language": "rus",
			"games_count": 581,
			"image_background": "https://media.rawg.io/media/games/d7d/d7d33daa1892e2468cd0263d5dfc957e.jpg"
		}, {
			"id": 150,
			"name": "Third-Person Shooter",
			"slug": "third-person-shooter",
			"language": "eng",
			"games_count": 1233,
			"image_background": "https://media.rawg.io/media/games/10d/10d19e52e5e8415d16a4d344fe711874.jpg"
		}, {
			"id": 62,
			"name": "Moddable",
			"slug": "moddable",
			"language": "eng",
			"games_count": 489,
			"image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
		}, {
			"id": 42438,
			"name": "Поддержка модификаций",
			"slug": "podderzhka-modifikatsii",
			"language": "rus",
			"games_count": 374,
			"image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
		}, {
			"id": 114,
			"name": "Physics",
			"slug": "physics",
			"language": "eng",
			"games_count": 11218,
			"image_background": "https://media.rawg.io/media/games/6fd/6fd971ffa72faa1758960d25ef6196bc.jpg"
		}, {
			"id": 42500,
			"name": "Физика",
			"slug": "fizika",
			"language": "rus",
			"games_count": 1373,
			"image_background": "https://media.rawg.io/media/screenshots/eef/eef872fddedf40e6d2236bb981725cc6.jpg"
		}, {
			"id": 42643,
			"name": "Паркур",
			"slug": "parkur-2",
			"language": "rus",
			"games_count": 317,
			"image_background": "https://media.rawg.io/media/games/fd6/fd6a1eecd3ec0f875f1924f3656b7dd9.jpg"
		}, {
			"id": 188,
			"name": "Parkour",
			"slug": "parkour",
			"language": "eng",
			"games_count": 1270,
			"image_background": "https://media.rawg.io/media/games/3d9/3d9bac98d79bcd2d445f829e8d6be902.jpg"
		}, {
			"id": 51,
			"name": "Destruction",
			"slug": "destruction",
			"language": "eng",
			"games_count": 2255,
			"image_background": "https://media.rawg.io/media/games/370/3703c683968a54f09630dcf03366ea35.jpg"
		}, {
			"id": 42560,
			"name": "Разрушения",
			"slug": "razrusheniia",
			"language": "rus",
			"games_count": 351,
			"image_background": "https://media.rawg.io/media/screenshots/18c/18c0bf89ecef8170cdd97075dbbadded.jpg"
		}],
		"esrb_rating": {
			"id": 4,
			"name": "Mature",
			"slug": "mature",
			"name_en": "Mature",
			"name_ru": "С 17 лет"
		},
		"user_game": null,
		"reviews_count": 1076,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/games/5bb/5bb55ccb8205aadbb6a144cf6d8963f1.jpg"
		}, {
			"id": 27484,
			"image": "https://media.rawg.io/media/screenshots/0dd/0dd5106115ca80c3af4f4901b25a2b47.jpg"
		}, {
			"id": 27487,
			"image": "https://media.rawg.io/media/screenshots/777/77712cd02b54765cd0c5e4f7d054e150.jpg"
		}, {
			"id": 27489,
			"image": "https://media.rawg.io/media/screenshots/ce6/ce6e57483d44cee91d1962d7775b8e0d.jpg"
		}, {
			"id": 27490,
			"image": "https://media.rawg.io/media/screenshots/dc4/dc419a4605ff9a1b227c50a74838e3ac.jpg"
		}, {
			"id": 27492,
			"image": "https://media.rawg.io/media/screenshots/59e/59e389b494a7cbd1ab5f23a3bf243f67.jpg"
		}, {
			"id": 27494,
			"image": "https://media.rawg.io/media/screenshots/bd0/bd0b533f3e3de4f1ea3e1a059d26ba1f.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 2,
				"name": "PlayStation",
				"slug": "playstation"
			}
		}, {
			"platform": {
				"id": 3,
				"name": "Xbox",
				"slug": "xbox"
			}
		}],
		"genres": [{
			"id": 2,
			"name": "Shooter",
			"slug": "shooter"
		}, {
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-2",
		"name": "Just Cause 2",
		"playtime": 3,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 1,
				"name": "Xbox One",
				"slug": "xbox-one"
			}
		}, {
			"platform": {
				"id": 14,
				"name": "Xbox 360",
				"slug": "xbox360"
			}
		}, {
			"platform": {
				"id": 16,
				"name": "PlayStation 3",
				"slug": "playstation3"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}, {
			"store": {
				"id": 3,
				"name": "PlayStation Store",
				"slug": "playstation-store"
			}
		}, {
			"store": {
				"id": 2,
				"name": "Xbox Store",
				"slug": "xbox-store"
			}
		}, {
			"store": {
				"id": 7,
				"name": "Xbox 360 Store",
				"slug": "xbox360"
			}
		}],
		"released": "2010-03-23",
		"tba": false,
		"background_image": "https://media.rawg.io/media/games/a3c/a3c529a12c896c0ef02db5b4741de2ba.jpg",
		"rating": 3.61,
		"rating_top": 4,
		"ratings": [{
			"id": 4,
			"title": "recommended",
			"count": 460,
			"percent": 50.66
		}, {
			"id": 3,
			"title": "meh",
			"count": 253,
			"percent": 27.86
		}, {
			"id": 5,
			"title": "exceptional",
			"count": 122,
			"percent": 13.44
		}, {
			"id": 1,
			"title": "skip",
			"count": 73,
			"percent": 8.04
		}],
		"ratings_count": 905,
		"reviews_text_count": 2,
		"added": 5744,
		"added_by_status": {
			"yet": 220,
			"owned": 4460,
			"beaten": 570,
			"toplay": 44,
			"dropped": 435,
			"playing": 15
		},
		"metacritic": 84,
		"suggestions_count": 586,
		"updated": "2020-08-03T02:24:58",
		"id": 4513,
		"score": "36.40421",
		"clip": null,
		"tags": [{
			"id": 31,
			"name": "Singleplayer",
			"slug": "singleplayer",
			"language": "eng",
			"games_count": 96950,
			"image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
		}, {
			"id": 42396,
			"name": "Для одного игрока",
			"slug": "dlia-odnogo-igroka",
			"language": "rus",
			"games_count": 13220,
			"image_background": "https://media.rawg.io/media/games/588/588c6bdff3d4baf66ec36b1c05b793bf.jpg"
		}, {
			"id": 42417,
			"name": "Экшен",
			"slug": "ekshen",
			"language": "rus",
			"games_count": 20656,
			"image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
		}, {
			"id": 42392,
			"name": "Приключение",
			"slug": "prikliuchenie",
			"language": "rus",
			"games_count": 18657,
			"image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
		}, {
			"id": 40847,
			"name": "Steam Achievements",
			"slug": "steam-achievements",
			"language": "eng",
			"games_count": 20335,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 7,
			"name": "Multiplayer",
			"slug": "multiplayer",
			"language": "eng",
			"games_count": 23130,
			"image_background": "https://media.rawg.io/media/games/1bb/1bb86c35ffa3eb0d299b01a7c65bf908.jpg"
		}, {
			"id": 40849,
			"name": "Steam Cloud",
			"slug": "steam-cloud",
			"language": "eng",
			"games_count": 9428,
			"image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
		}, {
			"id": 13,
			"name": "Atmospheric",
			"slug": "atmospheric",
			"language": "eng",
			"games_count": 10910,
			"image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
		}, {
			"id": 42400,
			"name": "Атмосфера",
			"slug": "atmosfera",
			"language": "rus",
			"games_count": 5107,
			"image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
		}, {
			"id": 42425,
			"name": "Для нескольких игроков",
			"slug": "dlia-neskolkikh-igrokov",
			"language": "rus",
			"games_count": 4496,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 40836,
			"name": "Full controller support",
			"slug": "full-controller-support",
			"language": "eng",
			"games_count": 9571,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 18,
			"name": "Co-op",
			"slug": "co-op",
			"language": "eng",
			"games_count": 6051,
			"image_background": "https://media.rawg.io/media/games/83f/83f6f70a7c1b86cd2637b029d8b42caa.jpg"
		}, {
			"id": 36,
			"name": "Open World",
			"slug": "open-world",
			"language": "eng",
			"games_count": 3258,
			"image_background": "https://media.rawg.io/media/games/9aa/9aa42d16d425fa6f179fc9dc2f763647.jpg"
		}, {
			"id": 411,
			"name": "cooperative",
			"slug": "cooperative",
			"language": "eng",
			"games_count": 2565,
			"image_background": "https://media.rawg.io/media/games/15c/15c95a4915f88a3e89c821526afe05fc.jpg"
		}, {
			"id": 42442,
			"name": "Открытый мир",
			"slug": "otkrytyi-mir",
			"language": "rus",
			"games_count": 2337,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42428,
			"name": "Шутер",
			"slug": "shuter",
			"language": "rus",
			"games_count": 2952,
			"image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
		}, {
			"id": 149,
			"name": "Third Person",
			"slug": "third-person",
			"language": "eng",
			"games_count": 3359,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42441,
			"name": "От третьего лица",
			"slug": "ot-tretego-litsa",
			"language": "rus",
			"games_count": 1589,
			"image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
		}, {
			"id": 30,
			"name": "FPS",
			"slug": "fps",
			"language": "eng",
			"games_count": 6530,
			"image_background": "https://media.rawg.io/media/games/7a2/7a2500ee8b2c0e1ff268bb4479463dea.jpg"
		}, {
			"id": 42482,
			"name": "Смешная",
			"slug": "smeshnaia",
			"language": "rus",
			"games_count": 3128,
			"image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
		}, {
			"id": 4,
			"name": "Funny",
			"slug": "funny",
			"language": "eng",
			"games_count": 11209,
			"image_background": "https://media.rawg.io/media/games/10d/10d19e52e5e8415d16a4d344fe711874.jpg"
		}, {
			"id": 42481,
			"name": "Юмор",
			"slug": "iumor",
			"language": "rus",
			"games_count": 1944,
			"image_background": "https://media.rawg.io/media/games/a3c/a3c529a12c896c0ef02db5b4741de2ba.jpg"
		}, {
			"id": 37,
			"name": "Sandbox",
			"slug": "sandbox",
			"language": "eng",
			"games_count": 3008,
			"image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
		}, {
			"id": 123,
			"name": "Comedy",
			"slug": "comedy",
			"language": "eng",
			"games_count": 5519,
			"image_background": "https://media.rawg.io/media/games/e3d/e3ddc524c6292a435d01d97cc5f42ea7.jpg"
		}, {
			"id": 42444,
			"name": "Песочница",
			"slug": "pesochnitsa",
			"language": "rus",
			"games_count": 1586,
			"image_background": "https://media.rawg.io/media/games/c22/c22d804ac753c72f2617b3708a625dec.jpg"
		}, {
			"id": 6,
			"name": "Exploration",
			"slug": "exploration",
			"language": "eng",
			"games_count": 8470,
			"image_background": "https://media.rawg.io/media/games/c89/c89ca70716080733d03724277df2c6c7.jpg"
		}, {
			"id": 42464,
			"name": "Исследование",
			"slug": "issledovanie",
			"language": "rus",
			"games_count": 2167,
			"image_background": "https://media.rawg.io/media/games/a3c/a3c529a12c896c0ef02db5b4741de2ba.jpg"
		}, {
			"id": 42446,
			"name": "Шутер от третьего лица",
			"slug": "shuter-ot-tretego-litsa",
			"language": "rus",
			"games_count": 581,
			"image_background": "https://media.rawg.io/media/games/d7d/d7d33daa1892e2468cd0263d5dfc957e.jpg"
		}, {
			"id": 150,
			"name": "Third-Person Shooter",
			"slug": "third-person-shooter",
			"language": "eng",
			"games_count": 1233,
			"image_background": "https://media.rawg.io/media/games/10d/10d19e52e5e8415d16a4d344fe711874.jpg"
		}, {
			"id": 62,
			"name": "Moddable",
			"slug": "moddable",
			"language": "eng",
			"games_count": 489,
			"image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
		}, {
			"id": 42438,
			"name": "Поддержка модификаций",
			"slug": "podderzhka-modifikatsii",
			"language": "rus",
			"games_count": 374,
			"image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
		}, {
			"id": 42453,
			"name": "ММО",
			"slug": "mmo-2",
			"language": "rus",
			"games_count": 1557,
			"image_background": "https://media.rawg.io/media/games/d0f/d0f91fe1d92332147e5db74e207cfc7a.jpg"
		}, {
			"id": 114,
			"name": "Physics",
			"slug": "physics",
			"language": "eng",
			"games_count": 11218,
			"image_background": "https://media.rawg.io/media/games/6fd/6fd971ffa72faa1758960d25ef6196bc.jpg"
		}, {
			"id": 42500,
			"name": "Физика",
			"slug": "fizika",
			"language": "rus",
			"games_count": 1373,
			"image_background": "https://media.rawg.io/media/screenshots/eef/eef872fddedf40e6d2236bb981725cc6.jpg"
		}, {
			"id": 133,
			"name": "3D Vision",
			"slug": "3d-vision",
			"language": "eng",
			"games_count": 160,
			"image_background": "https://media.rawg.io/media/games/9a1/9a18c226cf379272c698f26d2b79b3da.jpg"
		}, {
			"id": 42690,
			"name": "Красивая",
			"slug": "krasivaia",
			"language": "rus",
			"games_count": 471,
			"image_background": "https://media.rawg.io/media/games/569/569ea25d2b56bd05c7fa309ddabe81ff.jpg"
		}, {
			"id": 51,
			"name": "Destruction",
			"slug": "destruction",
			"language": "eng",
			"games_count": 2255,
			"image_background": "https://media.rawg.io/media/games/370/3703c683968a54f09630dcf03366ea35.jpg"
		}, {
			"id": 42560,
			"name": "Разрушения",
			"slug": "razrusheniia",
			"language": "rus",
			"games_count": 351,
			"image_background": "https://media.rawg.io/media/screenshots/18c/18c0bf89ecef8170cdd97075dbbadded.jpg"
		}],
		"esrb_rating": {
			"id": 4,
			"name": "Mature",
			"slug": "mature",
			"name_en": "Mature",
			"name_ru": "С 17 лет"
		},
		"user_game": null,
		"reviews_count": 908,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/games/a3c/a3c529a12c896c0ef02db5b4741de2ba.jpg"
		}, {
			"id": 184687,
			"image": "https://media.rawg.io/media/screenshots/34a/34a30f4a5a6f0e5c340d3c14456b8fcf.jpg"
		}, {
			"id": 184688,
			"image": "https://media.rawg.io/media/screenshots/118/11867f9fe44372fb65beb2f2e15ae030.jpg"
		}, {
			"id": 184689,
			"image": "https://media.rawg.io/media/screenshots/5c1/5c144b4d26fe4c41bb35aa3878498b4f.jpg"
		}, {
			"id": 184690,
			"image": "https://media.rawg.io/media/screenshots/39d/39d23cd38d9f6f9f45bf473c5ec4f49d.jpg"
		}, {
			"id": 184691,
			"image": "https://media.rawg.io/media/screenshots/dde/ddef23e3e0f22bc174b757cf69cc5816.jpg"
		}, {
			"id": 184692,
			"image": "https://media.rawg.io/media/screenshots/514/514908623cd01610f3e361887102e549.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 2,
				"name": "PlayStation",
				"slug": "playstation"
			}
		}, {
			"platform": {
				"id": 3,
				"name": "Xbox",
				"slug": "xbox"
			}
		}],
		"genres": [{
			"id": 2,
			"name": "Shooter",
			"slug": "shooter"
		}, {
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-4-reloaded",
		"name": "Just Cause 4: Reloaded",
		"playtime": 0,
		"platforms": [{
			"platform": {
				"id": 1,
				"name": "Xbox One",
				"slug": "xbox-one"
			}
		}, {
			"platform": {
				"id": 18,
				"name": "PlayStation 4",
				"slug": "playstation4"
			}
		}],
		"stores": [{
			"store": {
				"id": 3,
				"name": "PlayStation Store",
				"slug": "playstation-store"
			}
		}, {
			"store": {
				"id": 2,
				"name": "Xbox Store",
				"slug": "xbox-store"
			}
		}],
		"released": "2019-11-07",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/90d/90dff81acf29733d413a4de86c19929f.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [{
			"id": 4,
			"title": "recommended",
			"count": 2,
			"percent": 50.0
		}, {
			"id": 3,
			"title": "meh",
			"count": 1,
			"percent": 25.0
		}, {
			"id": 1,
			"title": "skip",
			"count": 1,
			"percent": 25.0
		}],
		"ratings_count": 4,
		"reviews_text_count": 0,
		"added": 9,
		"added_by_status": {
			"yet": 1,
			"owned": 1,
			"beaten": 2,
			"toplay": 3,
			"dropped": 1,
			"playing": 1
		},
		"metacritic": null,
		"suggestions_count": 399,
		"updated": "2019-11-18T01:35:48",
		"id": 389056,
		"score": "32.730606",
		"clip": null,
		"tags": [{
			"id": 37,
			"name": "Sandbox",
			"slug": "sandbox",
			"language": "eng",
			"games_count": 2995,
			"image_background": "https://media.rawg.io/media/games/d7d/d7d33daa1892e2468cd0263d5dfc957e.jpg"
		}, {
			"id": 15,
			"name": "Stealth",
			"slug": "stealth",
			"language": "eng",
			"games_count": 3344,
			"image_background": "https://media.rawg.io/media/games/d46/d46373f39458670305704ef089387520.jpg"
		}, {
			"id": 413,
			"name": "online",
			"slug": "online",
			"language": "eng",
			"games_count": 5297,
			"image_background": "https://media.rawg.io/media/screenshots/788/788959118998613640c18b13b498a6d2.jpg"
		}, {
			"id": 5777,
			"name": "pack",
			"slug": "pack",
			"language": "eng",
			"games_count": 1654,
			"image_background": "https://media.rawg.io/media/screenshots/cd4/cd49a6f060ac50433f3b1d36a1116059_PclZQ8d.jpg"
		}, {
			"id": 2168,
			"name": "racer",
			"slug": "racer",
			"language": "eng",
			"games_count": 1194,
			"image_background": "https://media.rawg.io/media/games/f2f/f2fdc4c16129ec0a594955d558098d1f.jpg"
		}, {
			"id": 2876,
			"name": "square",
			"slug": "square",
			"language": "eng",
			"games_count": 982,
			"image_background": "https://media.rawg.io/media/screenshots/09c/09c4e62ffe10a6f087d9f86e2e562681.jpg"
		}, {
			"id": 1202,
			"name": "Neon",
			"slug": "neon",
			"language": "eng",
			"games_count": 1334,
			"image_background": "https://media.rawg.io/media/screenshots/7a4/7a48f6e1f542f41c7866b3beacb7a189.jpg"
		}],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 4,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/90d/90dff81acf29733d413a4de86c19929f.jpg"
		}, {
			"id": 2227034,
			"image": "https://media.rawg.io/media/screenshots/a37/a37a4a08f45937f516e787cf14aec858.jpg"
		}, {
			"id": 2227035,
			"image": "https://media.rawg.io/media/screenshots/656/656e299e1d41088bc06195e7080c249a.jpg"
		}, {
			"id": 2227036,
			"image": "https://media.rawg.io/media/screenshots/f3c/f3c929773ce9af93151f01a3ca7bc6c1.jpg"
		}, {
			"id": 2227037,
			"image": "https://media.rawg.io/media/screenshots/241/241e8bf3638ba2b4e0c809c1b0af20ea.jpg"
		}, {
			"id": 2227038,
			"image": "https://media.rawg.io/media/screenshots/f0e/f0e0c3d1a1a9a95bc93535f246a3e0c8.jpg"
		}, {
			"id": 2227039,
			"image": "https://media.rawg.io/media/screenshots/90d/90dff81acf29733d413a4de86c19929f.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 2,
				"name": "PlayStation",
				"slug": "playstation"
			}
		}, {
			"platform": {
				"id": 3,
				"name": "Xbox",
				"slug": "xbox"
			}
		}],
		"genres": []
	}, {
		"slug": "just-cause-3-wingsuit-tour",
		"name": "Just Cause 3: WingSuit Tour",
		"playtime": 0,
		"platforms": [{
			"platform": {
				"id": 21,
				"name": "Android",
				"slug": "android"
			}
		}],
		"stores": [{
			"store": {
				"id": 8,
				"name": "Google Play",
				"slug": "google-play"
			}
		}],
		"released": null,
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/c88/c887d531875d989ccc13ab2a200addab.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [{
			"id": 1,
			"title": "skip",
			"count": 2,
			"percent": 66.67
		}, {
			"id": 4,
			"title": "recommended",
			"count": 1,
			"percent": 33.33
		}],
		"ratings_count": 3,
		"reviews_text_count": 0,
		"added": 4,
		"added_by_status": {
			"owned": 2,
			"beaten": 1,
			"dropped": 1
		},
		"metacritic": null,
		"suggestions_count": 215,
		"updated": "2019-01-09T12:41:06",
		"id": 48404,
		"score": "29.744812",
		"clip": null,
		"tags": [{
			"id": 1221,
			"name": "history",
			"slug": "history",
			"language": "eng",
			"games_count": 1747,
			"image_background": "https://media.rawg.io/media/screenshots/593/5936a7fb9b53cd38341957cbf03be625.jpg"
		}, {
			"id": 1329,
			"name": "phone",
			"slug": "phone",
			"language": "eng",
			"games_count": 2716,
			"image_background": "https://media.rawg.io/media/screenshots/e14/e143ad42ced586b2ee3ff0537d078d52.jpg"
		}],
		"esrb_rating": {
			"id": 3,
			"name": "Teen",
			"slug": "teen",
			"name_en": "Teen",
			"name_ru": "С 13 лет"
		},
		"user_game": null,
		"reviews_count": 3,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/c88/c887d531875d989ccc13ab2a200addab.jpg"
		}, {
			"id": 683761,
			"image": "https://media.rawg.io/media/screenshots/05d/05d7533147f9238bc4dab99207fb62b3.jpg"
		}, {
			"id": 683762,
			"image": "https://media.rawg.io/media/screenshots/742/742df825cfeb018c75befd6cbb9cbc5e.jpg"
		}, {
			"id": 683763,
			"image": "https://media.rawg.io/media/screenshots/12f/12fc627bd8f93a5f5512663464b2388c.jpg"
		}, {
			"id": 683764,
			"image": "https://media.rawg.io/media/screenshots/ce8/ce848ac08e9e30534ab3044dde296702.jpg"
		}, {
			"id": 683765,
			"image": "https://media.rawg.io/media/screenshots/7c5/7c546b0ebd5f5a333061a1a75a85e379.jpg"
		}, {
			"id": 683766,
			"image": "https://media.rawg.io/media/screenshots/cce/cce9134eca786abe5207b3339570eda7.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 8,
				"name": "Android",
				"slug": "android"
			}
		}],
		"genres": [{
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-3-sky-fortress",
		"name": "Just Cause 3: Sky Fortress",
		"playtime": 0,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": null,
		"released": "2016-03-15",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/9b7/9b77a792da41f01f3a5456d4b58314d7.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [{
			"id": 3,
			"title": "meh",
			"count": 1,
			"percent": 100.0
		}],
		"ratings_count": 1,
		"reviews_text_count": 0,
		"added": 6,
		"added_by_status": {
			"yet": 1,
			"beaten": 2,
			"toplay": 2,
			"dropped": 1
		},
		"metacritic": null,
		"suggestions_count": 47,
		"updated": "2020-01-14T13:11:37",
		"id": 404458,
		"score": "29.046295",
		"clip": null,
		"tags": [],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 1,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/9b7/9b77a792da41f01f3a5456d4b58314d7.jpg"
		}, {
			"id": 2271824,
			"image": "https://media.rawg.io/media/screenshots/9b7/9b77a792da41f01f3a5456d4b58314d7.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-4-danger-rising",
		"name": "Just Cause 4 - Danger Rising",
		"playtime": 0,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": null,
		"released": "2019-09-05",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/23a/23a3edc506792b506cb6467542eebd02.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [{
			"id": 3,
			"title": "meh",
			"count": 1,
			"percent": 100.0
		}],
		"ratings_count": 1,
		"reviews_text_count": 0,
		"added": 5,
		"added_by_status": {
			"yet": 1,
			"beaten": 1,
			"toplay": 2,
			"dropped": 1
		},
		"metacritic": null,
		"suggestions_count": 61,
		"updated": "2020-01-14T15:15:50",
		"id": 404480,
		"score": "28.177593",
		"clip": null,
		"tags": [],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 1,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/23a/23a3edc506792b506cb6467542eebd02.jpg"
		}, {
			"id": 2271848,
			"image": "https://media.rawg.io/media/screenshots/23a/23a3edc506792b506cb6467542eebd02.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-4-los-demonios",
		"name": "Just Cause 4  Los Demonios",
		"playtime": 0,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 1,
				"name": "Xbox One",
				"slug": "xbox-one"
			}
		}, {
			"platform": {
				"id": 18,
				"name": "PlayStation 4",
				"slug": "playstation4"
			}
		}],
		"stores": null,
		"released": "2019-07-03",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/a49/a4984b40e4cfc14eb259a7ca3903b7eb.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [{
			"id": 3,
			"title": "meh",
			"count": 2,
			"percent": 100.0
		}],
		"ratings_count": 2,
		"reviews_text_count": 0,
		"added": 13,
		"added_by_status": {
			"yet": 2,
			"owned": 3,
			"beaten": 2,
			"toplay": 5,
			"dropped": 1
		},
		"metacritic": null,
		"suggestions_count": 325,
		"updated": "2020-06-15T14:50:05",
		"id": 321235,
		"score": "28.177593",
		"clip": null,
		"tags": [{
			"id": 187,
			"name": "Demons",
			"slug": "demons",
			"language": "eng",
			"games_count": 808,
			"image_background": "https://media.rawg.io/media/games/38a/38af969459ad6e5de116ec8a4a84218c.jpg"
		}],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 2,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/a49/a4984b40e4cfc14eb259a7ca3903b7eb.jpg"
		}, {
			"id": 1938241,
			"image": "https://media.rawg.io/media/screenshots/6a5/6a5be8b16a83cea86bc7454c857ff74d.jpg"
		}, {
			"id": 1938242,
			"image": "https://media.rawg.io/media/screenshots/f94/f94a31ddec3590811fdc5c7e3f0612e8.jpg"
		}, {
			"id": 1938243,
			"image": "https://media.rawg.io/media/screenshots/81f/81f4cd83ba63f16781db3de1c52f7980.jpg"
		}, {
			"id": 2246178,
			"image": "https://media.rawg.io/media/screenshots/605/605a8ddd70636c4ab14f8cedc108a0ca.jpeg"
		}, {
			"id": 2246179,
			"image": "https://media.rawg.io/media/screenshots/ac9/ac9a5e6d834749c51fc2665baeb2cee5.jpg"
		}, {
			"id": 2246180,
			"image": "https://media.rawg.io/media/screenshots/a49/a4984b40e4cfc14eb259a7ca3903b7eb.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 2,
				"name": "PlayStation",
				"slug": "playstation"
			}
		}, {
			"platform": {
				"id": 3,
				"name": "Xbox",
				"slug": "xbox"
			}
		}],
		"genres": [{
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-3-mech-land-assault",
		"name": "Just Cause 3: Mech Land Assault",
		"playtime": 0,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": null,
		"released": "2016-06-10",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/5bc/5bc87b652df552b53ce1b8344066818f.jpg",
		"rating": 0.0,
		"rating_top": 4,
		"ratings": [{
			"id": 4,
			"title": "recommended",
			"count": 3,
			"percent": 60.0
		}, {
			"id": 3,
			"title": "meh",
			"count": 1,
			"percent": 20.0
		}, {
			"id": 1,
			"title": "skip",
			"count": 1,
			"percent": 20.0
		}],
		"ratings_count": 5,
		"reviews_text_count": 0,
		"added": 11,
		"added_by_status": {
			"yet": 1,
			"owned": 1,
			"beaten": 5,
			"toplay": 3,
			"dropped": 1
		},
		"metacritic": null,
		"suggestions_count": 559,
		"updated": "2019-01-09T12:41:06",
		"id": 43727,
		"score": "25.903217",
		"clip": null,
		"tags": [],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 5,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/5bc/5bc87b652df552b53ce1b8344066818f.jpg"
		}, {
			"id": 628525,
			"image": "https://media.rawg.io/media/screenshots/1cf/1cfba4069dff3fe94fa34cce26f24d37.jpg"
		}, {
			"id": 628526,
			"image": "https://media.rawg.io/media/screenshots/8df/8df62bc75d2dcbf9d85257767ec56522.jpg"
		}, {
			"id": 628527,
			"image": "https://media.rawg.io/media/screenshots/969/96947c7220e1cd16be677be91306392f.jpg"
		}, {
			"id": 628528,
			"image": "https://media.rawg.io/media/screenshots/55e/55eafce5ee44b08ed087e528ad47133c.jpg"
		}, {
			"id": 628529,
			"image": "https://media.rawg.io/media/screenshots/ba9/ba9a748816555217437208aeaee32877.jpg"
		}, {
			"id": 628530,
			"image": "https://media.rawg.io/media/screenshots/070/07014a977a6f8f16db3e78b619b5189b.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 1,
			"name": "Racing",
			"slug": "racing"
		}, {
			"id": 2,
			"name": "Shooter",
			"slug": "shooter"
		}, {
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-3-bavarium-sea-heist",
		"name": "Just Cause 3: Bavarium Sea Heist",
		"playtime": 0,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": null,
		"released": "2016-08-18",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/078/07830260f158092556969c65958cf649.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [{
			"id": 3,
			"title": "meh",
			"count": 1,
			"percent": 100.0
		}],
		"ratings_count": 1,
		"reviews_text_count": 0,
		"added": 5,
		"added_by_status": {
			"yet": 1,
			"beaten": 1,
			"toplay": 2,
			"dropped": 1
		},
		"metacritic": null,
		"suggestions_count": 55,
		"updated": "2020-01-14T13:13:28",
		"id": 404459,
		"score": "25.903217",
		"clip": null,
		"tags": [],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 1,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/078/07830260f158092556969c65958cf649.jpg"
		}, {
			"id": 2271825,
			"image": "https://media.rawg.io/media/screenshots/078/07830260f158092556969c65958cf649.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-cause-4-dare-devils-of-destruction",
		"name": "Just Cause 4 - Dare Devils of Destruction",
		"playtime": 0,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": null,
		"released": "2019-04-30",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/d2f/d2fc7ab17191c912f56fb69d9d7da26b.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [{
			"id": 3,
			"title": "meh",
			"count": 2,
			"percent": 100.0
		}],
		"ratings_count": 2,
		"reviews_text_count": 0,
		"added": 4,
		"added_by_status": {
			"beaten": 2,
			"toplay": 1,
			"dropped": 1
		},
		"metacritic": null,
		"suggestions_count": 89,
		"updated": "2019-11-29T20:28:14",
		"id": 395173,
		"score": "23.57493",
		"clip": null,
		"tags": [],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 2,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/d2f/d2fc7ab17191c912f56fb69d9d7da26b.jpg"
		}, {
			"id": 2246176,
			"image": "https://media.rawg.io/media/screenshots/690/6907e10c49006e0bfb75cab35e027763.jpg"
		}, {
			"id": 2246177,
			"image": "https://media.rawg.io/media/screenshots/d2f/d2fc7ab17191c912f56fb69d9d7da26b.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "h1z1-just-survive",
		"name": "H1Z1: Just Survive",
		"playtime": 12,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}],
		"released": "2015-01-15",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/ff2/ff244a89bde8395c8d3664df8dbbd332.jpg",
		"rating": 2.33,
		"rating_top": 1,
		"ratings": [{
			"id": 1,
			"title": "skip",
			"count": 30,
			"percent": 44.78
		}, {
			"id": 3,
			"title": "meh",
			"count": 24,
			"percent": 35.82
		}, {
			"id": 4,
			"title": "recommended",
			"count": 11,
			"percent": 16.42
		}, {
			"id": 5,
			"title": "exceptional",
			"count": 2,
			"percent": 2.99
		}],
		"ratings_count": 66,
		"reviews_text_count": 1,
		"added": 578,
		"added_by_status": {
			"yet": 6,
			"owned": 518,
			"beaten": 8,
			"toplay": 3,
			"dropped": 43
		},
		"metacritic": null,
		"suggestions_count": 297,
		"updated": "2019-09-17T05:08:06",
		"id": 11473,
		"score": "19.909935",
		"clip": null,
		"tags": [{
			"id": 42417,
			"name": "Экшен",
			"slug": "ekshen",
			"language": "rus",
			"games_count": 20656,
			"image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
		}, {
			"id": 42392,
			"name": "Приключение",
			"slug": "prikliuchenie",
			"language": "rus",
			"games_count": 18657,
			"image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
		}, {
			"id": 7,
			"name": "Multiplayer",
			"slug": "multiplayer",
			"language": "eng",
			"games_count": 23130,
			"image_background": "https://media.rawg.io/media/games/1bb/1bb86c35ffa3eb0d299b01a7c65bf908.jpg"
		}, {
			"id": 7808,
			"name": "steam-trading-cards",
			"slug": "steam-trading-cards",
			"language": "eng",
			"games_count": 7604,
			"image_background": "https://media.rawg.io/media/games/55e/55ee6432ac2bf224610fa17e4c652107.jpg"
		}, {
			"id": 42425,
			"name": "Для нескольких игроков",
			"slug": "dlia-neskolkikh-igrokov",
			"language": "rus",
			"games_count": 4496,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 24,
			"name": "RPG",
			"slug": "rpg",
			"language": "eng",
			"games_count": 10811,
			"image_background": "https://media.rawg.io/media/games/26d/26d4437715bee60138dab4a7c8c59c92.jpg"
		}, {
			"id": 18,
			"name": "Co-op",
			"slug": "co-op",
			"language": "eng",
			"games_count": 6051,
			"image_background": "https://media.rawg.io/media/games/83f/83f6f70a7c1b86cd2637b029d8b42caa.jpg"
		}, {
			"id": 42412,
			"name": "Ролевая игра",
			"slug": "rolevaia-igra",
			"language": "rus",
			"games_count": 8253,
			"image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
		}, {
			"id": 36,
			"name": "Open World",
			"slug": "open-world",
			"language": "eng",
			"games_count": 3258,
			"image_background": "https://media.rawg.io/media/games/9aa/9aa42d16d425fa6f179fc9dc2f763647.jpg"
		}, {
			"id": 411,
			"name": "cooperative",
			"slug": "cooperative",
			"language": "eng",
			"games_count": 2565,
			"image_background": "https://media.rawg.io/media/games/15c/15c95a4915f88a3e89c821526afe05fc.jpg"
		}, {
			"id": 42442,
			"name": "Открытый мир",
			"slug": "otkrytyi-mir",
			"language": "rus",
			"games_count": 2337,
			"image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
		}, {
			"id": 42428,
			"name": "Шутер",
			"slug": "shuter",
			"language": "rus",
			"games_count": 2952,
			"image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
		}, {
			"id": 30,
			"name": "FPS",
			"slug": "fps",
			"language": "eng",
			"games_count": 6530,
			"image_background": "https://media.rawg.io/media/games/7a2/7a2500ee8b2c0e1ff268bb4479463dea.jpg"
		}, {
			"id": 16,
			"name": "Horror",
			"slug": "horror",
			"language": "eng",
			"games_count": 18297,
			"image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
		}, {
			"id": 42427,
			"name": "Шутер от первого лица",
			"slug": "shuter-ot-pervogo-litsa",
			"language": "rus",
			"games_count": 2083,
			"image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
		}, {
			"id": 42413,
			"name": "Симулятор",
			"slug": "simuliator",
			"language": "rus",
			"games_count": 9425,
			"image_background": "https://media.rawg.io/media/games/1a1/1a17e9b6286edb7e1f1e510110ccb0c0.jpg"
		}, {
			"id": 37,
			"name": "Sandbox",
			"slug": "sandbox",
			"language": "eng",
			"games_count": 3008,
			"image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
		}, {
			"id": 1,
			"name": "Survival",
			"slug": "survival",
			"language": "eng",
			"games_count": 4239,
			"image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
		}, {
			"id": 42444,
			"name": "Песочница",
			"slug": "pesochnitsa",
			"language": "rus",
			"games_count": 1586,
			"image_background": "https://media.rawg.io/media/games/c22/c22d804ac753c72f2617b3708a625dec.jpg"
		}, {
			"id": 42452,
			"name": "Выживание",
			"slug": "vyzhivanie",
			"language": "rus",
			"games_count": 2349,
			"image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
		}, {
			"id": 6,
			"name": "Exploration",
			"slug": "exploration",
			"language": "eng",
			"games_count": 8470,
			"image_background": "https://media.rawg.io/media/games/c89/c89ca70716080733d03724277df2c6c7.jpg"
		}, {
			"id": 42464,
			"name": "Исследование",
			"slug": "issledovanie",
			"language": "rus",
			"games_count": 2167,
			"image_background": "https://media.rawg.io/media/games/a3c/a3c529a12c896c0ef02db5b4741de2ba.jpg"
		}, {
			"id": 63,
			"name": "Zombies",
			"slug": "zombies",
			"language": "eng",
			"games_count": 6063,
			"image_background": "https://media.rawg.io/media/games/364/3642d850efb217c58feab80b8affaa89.jpg"
		}, {
			"id": 42411,
			"name": "Ранний доступ",
			"slug": "rannii-dostup",
			"language": "rus",
			"games_count": 6745,
			"image_background": "https://media.rawg.io/media/games/87a/87a29bcc56b6b6082ead1dd5e2510aaa.jpg"
		}, {
			"id": 42544,
			"name": "Зомби",
			"slug": "zombi-2",
			"language": "rus",
			"games_count": 1034,
			"image_background": "https://media.rawg.io/media/games/f14/f1422eacab98c5f85a5123da4e9d9e89.jpg"
		}, {
			"id": 42453,
			"name": "ММО",
			"slug": "mmo-2",
			"language": "rus",
			"games_count": 1557,
			"image_background": "https://media.rawg.io/media/games/d0f/d0f91fe1d92332147e5db74e207cfc7a.jpg"
		}, {
			"id": 14,
			"name": "Early Access",
			"slug": "early-access",
			"language": "eng",
			"games_count": 7226,
			"image_background": "https://media.rawg.io/media/screenshots/88b/88b5f27f07d6ca2f8a3cd0b36e03a670.jpg"
		}, {
			"id": 43,
			"name": "Post-apocalyptic",
			"slug": "post-apocalyptic",
			"language": "eng",
			"games_count": 1561,
			"image_background": "https://media.rawg.io/media/games/df9/df988191048e92cf86dabd2987c47b62.jpg"
		}, {
			"id": 42488,
			"name": "Пост-апокалипсис",
			"slug": "post-apokalipsis",
			"language": "rus",
			"games_count": 623,
			"image_background": "https://media.rawg.io/media/games/c73/c73c4ffebfe968ba0982a56c2b5020ef.jpg"
		}, {
			"id": 17,
			"name": "Survival Horror",
			"slug": "survival-horror",
			"language": "eng",
			"games_count": 3434,
			"image_background": "https://media.rawg.io/media/games/daa/daaee07fcb40744d90cf8142f94a241f.jpg"
		}, {
			"id": 42471,
			"name": "Хоррор на выживание",
			"slug": "khorror-na-vyzhivanie",
			"language": "rus",
			"games_count": 1000,
			"image_background": "https://media.rawg.io/media/games/447/4470c1e76f01acfaf5af9c207d1c1c92.jpg"
		}, {
			"id": 42555,
			"name": "Симулятор ходьбы",
			"slug": "simuliator-khodby",
			"language": "rus",
			"games_count": 724,
			"image_background": "https://media.rawg.io/media/games/0be/0bea0a08a4d954337305391b778a7f37.jpg"
		}, {
			"id": 91,
			"name": "Walking Simulator",
			"slug": "walking-simulator",
			"language": "eng",
			"games_count": 3376,
			"image_background": "https://media.rawg.io/media/games/ba9/ba9ad92b6d04825bd15a407c6059db94.jpg"
		}, {
			"id": 125,
			"name": "Crafting",
			"slug": "crafting",
			"language": "eng",
			"games_count": 1560,
			"image_background": "https://media.rawg.io/media/games/7e7/7e79e3296a7f64e7535c9e5bb5aa4b53.jpg"
		}, {
			"id": 42497,
			"name": "Крафтинг",
			"slug": "krafting",
			"language": "rus",
			"games_count": 794,
			"image_background": "https://media.rawg.io/media/screenshots/e78/e7809ca81f6fc47e4ae8b116e1299781.jpg"
		}, {
			"id": 1656,
			"name": "mmo",
			"slug": "mmo",
			"language": "eng",
			"games_count": 1099,
			"image_background": "https://media.rawg.io/media/screenshots/6d3/6d367773c06886535620f2d7fb1cb866.jpg"
		}],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 67,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/ff2/ff244a89bde8395c8d3664df8dbbd332.jpg"
		}, {
			"id": 93454,
			"image": "https://media.rawg.io/media/screenshots/789/7894fd3fdc7435314162989964ff5e09.jpg"
		}, {
			"id": 93455,
			"image": "https://media.rawg.io/media/screenshots/1bd/1bd4f740ee282f101b3e9dc0a3219124.jpg"
		}, {
			"id": 93456,
			"image": "https://media.rawg.io/media/screenshots/83c/83c19cfeb40d9cf2c92a3acde5386e2d.jpg"
		}, {
			"id": 93457,
			"image": "https://media.rawg.io/media/screenshots/822/822cb9b855479f8d427e3f100ddef455.jpg"
		}, {
			"id": 93458,
			"image": "https://media.rawg.io/media/screenshots/ff2/ff244a89bde8395c8d3664df8dbbd332.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 59,
			"name": "Massively Multiplayer",
			"slug": "massively-multiplayer"
		}, {
			"id": 3,
			"name": "Adventure",
			"slug": "adventure"
		}, {
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "cosmic-dust-rust",
		"name": "Cosmic Dust & Rust",
		"playtime": 4,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}],
		"released": "2016-05-17",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/840/840e6adc716c65db8ae9c448c0404782.jpg",
		"rating": 2.07,
		"rating_top": 3,
		"ratings": [{
			"id": 3,
			"title": "meh",
			"count": 8,
			"percent": 53.33
		}, {
			"id": 1,
			"title": "skip",
			"count": 7,
			"percent": 46.67
		}],
		"ratings_count": 15,
		"reviews_text_count": 0,
		"added": 506,
		"added_by_status": {
			"yet": 21,
			"owned": 480,
			"beaten": 2,
			"dropped": 3
		},
		"metacritic": null,
		"suggestions_count": 205,
		"updated": "2019-09-17T05:18:08",
		"id": 19810,
		"score": "16.423292",
		"clip": null,
		"tags": [{
			"id": 31,
			"name": "Singleplayer",
			"slug": "singleplayer",
			"language": "eng",
			"games_count": 96950,
			"image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
		}, {
			"id": 42417,
			"name": "Экшен",
			"slug": "ekshen",
			"language": "rus",
			"games_count": 20656,
			"image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
		}, {
			"id": 42398,
			"name": "Инди",
			"slug": "indi-2",
			"language": "rus",
			"games_count": 32737,
			"image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
		}, {
			"id": 7808,
			"name": "steam-trading-cards",
			"slug": "steam-trading-cards",
			"language": "eng",
			"games_count": 7604,
			"image_background": "https://media.rawg.io/media/games/55e/55ee6432ac2bf224610fa17e4c652107.jpg"
		}, {
			"id": 42421,
			"name": "Стратегия",
			"slug": "strategiia",
			"language": "rus",
			"games_count": 9458,
			"image_background": "https://media.rawg.io/media/games/8bd/8bd24e3c15354a9555bb1437fe555a69.jpg"
		}, {
			"id": 42399,
			"name": "Казуальная игра",
			"slug": "kazualnaia-igra",
			"language": "rus",
			"games_count": 18329,
			"image_background": "https://media.rawg.io/media/games/6d3/6d33014a4ed48a19c30a77ead5a0f62e.jpg"
		}, {
			"id": 42420,
			"name": "Сложная",
			"slug": "slozhnaia",
			"language": "rus",
			"games_count": 3247,
			"image_background": "https://media.rawg.io/media/games/c7a/c7a71a0531a9518236d99d0d60abe447.jpg"
		}, {
			"id": 49,
			"name": "Difficult",
			"slug": "difficult",
			"language": "eng",
			"games_count": 7513,
			"image_background": "https://media.rawg.io/media/games/9bf/9bfac18ff678f41a4674250fa0e04a52.jpg"
		}, {
			"id": 42415,
			"name": "Пиксельная графика",
			"slug": "pikselnaia-grafika",
			"language": "rus",
			"games_count": 3642,
			"image_background": "https://media.rawg.io/media/screenshots/2fc/2fc6994425146f9dba3133400b414e29.jpg"
		}, {
			"id": 122,
			"name": "Pixel Graphics",
			"slug": "pixel-graphics",
			"language": "eng",
			"games_count": 41129,
			"image_background": "https://media.rawg.io/media/screenshots/d2f/d2f276efb1fda563321a0f06ca37c342.jpg"
		}, {
			"id": 42533,
			"name": "Башенная защита",
			"slug": "bashennaia-zashchita",
			"language": "rus",
			"games_count": 705,
			"image_background": "https://media.rawg.io/media/screenshots/f10/f10e7cafed6665861c58187b2ae3b310.jpg"
		}, {
			"id": 65,
			"name": "Tower Defense",
			"slug": "tower-defense",
			"language": "eng",
			"games_count": 3427,
			"image_background": "https://media.rawg.io/media/games/417/4176298c1b22ccd338ce3dfc34eb7e28.jpg"
		}],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 15,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/840/840e6adc716c65db8ae9c448c0404782.jpg"
		}, {
			"id": 186729,
			"image": "https://media.rawg.io/media/screenshots/895/8954452b92b08f9abb902f675a7389e5.jpg"
		}, {
			"id": 186730,
			"image": "https://media.rawg.io/media/screenshots/c1e/c1ed9cd8e52fdf823fd8e6028823002e.jpg"
		}, {
			"id": 186731,
			"image": "https://media.rawg.io/media/screenshots/2ec/2ec4e3f2ea6cb89cdbeec617c7d8b6d3.jpg"
		}, {
			"id": 186732,
			"image": "https://media.rawg.io/media/screenshots/72d/72db224dd42b33cf603d36a8a1707f2a.jpg"
		}, {
			"id": 186733,
			"image": "https://media.rawg.io/media/screenshots/840/840e6adc716c65db8ae9c448c0404782.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 40,
			"name": "Casual",
			"slug": "casual"
		}, {
			"id": 10,
			"name": "Strategy",
			"slug": "strategy"
		}, {
			"id": 51,
			"name": "Indie",
			"slug": "indie"
		}, {
			"id": 4,
			"name": "Action",
			"slug": "action"
		}]
	}, {
		"slug": "just-bearly",
		"name": "Just, Bearly",
		"playtime": 1,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}],
		"released": "2018-05-31",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/d45/d45b7c3a59f71361120448175e62e796.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [{
			"id": 5,
			"title": "exceptional",
			"count": 1,
			"percent": 50.0
		}, {
			"id": 1,
			"title": "skip",
			"count": 1,
			"percent": 50.0
		}],
		"ratings_count": 2,
		"reviews_text_count": 0,
		"added": 57,
		"added_by_status": {
			"yet": 3,
			"owned": 52,
			"beaten": 2
		},
		"metacritic": null,
		"suggestions_count": 134,
		"updated": "2019-08-28T21:56:14",
		"id": 63796,
		"score": "14.489994",
		"clip": null,
		"tags": [{
			"id": 31,
			"name": "Singleplayer",
			"slug": "singleplayer",
			"language": "eng",
			"games_count": 96950,
			"image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
		}, {
			"id": 40847,
			"name": "Steam Achievements",
			"slug": "steam-achievements",
			"language": "eng",
			"games_count": 20335,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 42398,
			"name": "Инди",
			"slug": "indi-2",
			"language": "rus",
			"games_count": 32737,
			"image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
		}, {
			"id": 42394,
			"name": "Глубокий сюжет",
			"slug": "glubokii-siuzhet",
			"language": "rus",
			"games_count": 3841,
			"image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
		}, {
			"id": 118,
			"name": "Story Rich",
			"slug": "story-rich",
			"language": "eng",
			"games_count": 8330,
			"image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
		}, {
			"id": 42399,
			"name": "Казуальная игра",
			"slug": "kazualnaia-igra",
			"language": "rus",
			"games_count": 18329,
			"image_background": "https://media.rawg.io/media/games/6d3/6d33014a4ed48a19c30a77ead5a0f62e.jpg"
		}, {
			"id": 42481,
			"name": "Юмор",
			"slug": "iumor",
			"language": "rus",
			"games_count": 1944,
			"image_background": "https://media.rawg.io/media/games/a3c/a3c529a12c896c0ef02db5b4741de2ba.jpg"
		}, {
			"id": 123,
			"name": "Comedy",
			"slug": "comedy",
			"language": "eng",
			"games_count": 5519,
			"image_background": "https://media.rawg.io/media/games/e3d/e3ddc524c6292a435d01d97cc5f42ea7.jpg"
		}, {
			"id": 42538,
			"name": "Бесплатная игра",
			"slug": "besplatnaia-igra",
			"language": "rus",
			"games_count": 3463,
			"image_background": "https://media.rawg.io/media/games/26b/26b27e1da9e3727fcb12e3e4e86c8c19.jpg"
		}, {
			"id": 42502,
			"name": "Чёрный юмор",
			"slug": "chiornyi-iumor",
			"language": "rus",
			"games_count": 451,
			"image_background": "https://media.rawg.io/media/screenshots/891/8910274c8fe4ae2a5808ca4c31b4640e.jpg"
		}, {
			"id": 148,
			"name": "Dark Humor",
			"slug": "dark-humor",
			"language": "eng",
			"games_count": 1345,
			"image_background": "https://media.rawg.io/media/games/df2/df20fd77db56ae7b0a26a7ff4baa9ccc.jpg"
		}, {
			"id": 42628,
			"name": "Чёрная комедия",
			"slug": "chiornaia-komediia",
			"language": "rus",
			"games_count": 217,
			"image_background": "https://media.rawg.io/media/screenshots/6ec/6ecd5ae34709cd5fa2bd3cc44d94f73e.jpg"
		}, {
			"id": 94,
			"name": "Design & Illustration",
			"slug": "design-illustration",
			"language": "eng",
			"games_count": 183,
			"image_background": "https://media.rawg.io/media/screenshots/c6d/c6d0165e39bcb263d8b1b6319cd759e0.jpg"
		}, {
			"id": 237,
			"name": "Dark Comedy",
			"slug": "dark-comedy",
			"language": "eng",
			"games_count": 157,
			"image_background": "https://media.rawg.io/media/screenshots/a0e/a0e808954d87ffb5696234bac380f79d.jpg"
		}, {
			"id": 42701,
			"name": "Нарочито неудобное управление",
			"slug": "narochito-neudobnoe-upravlenie",
			"language": "rus",
			"games_count": 32,
			"image_background": "https://media.rawg.io/media/screenshots/887/887d82b6c089319ae32dec742d55e3c4.jpg"
		}, {
			"id": 332,
			"name": "Intentionally Awkward Controls",
			"slug": "intentionally-awkward-controls",
			"language": "eng",
			"games_count": 18,
			"image_background": "https://media.rawg.io/media/screenshots/2c6/2c6b99ad019891f467879d5dee0f9ebc.jpg"
		}, {
			"id": 42572,
			"name": "Дизайн и иллюстрация",
			"slug": "dizain-i-illiustratsiia",
			"language": "rus",
			"games_count": 85,
			"image_background": "https://media.rawg.io/media/screenshots/fbb/fbb2900bfc74ef2ba67f1e02f834c25b.jpg"
		}, {
			"id": 42661,
			"name": "Об играх",
			"slug": "ob-igrakh",
			"language": "rus",
			"games_count": 28,
			"image_background": "https://media.rawg.io/media/screenshots/19a/19a92c7056f834ed49585ef373c2534b.jpg"
		}, {
			"id": 307,
			"name": "Gaming",
			"slug": "gaming",
			"language": "eng",
			"games_count": 115,
			"image_background": "https://media.rawg.io/media/screenshots/6c6/6c6146f4964e428073fb9472e88bb506_4UtOVTF.jpg"
		}],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 2,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/d45/d45b7c3a59f71361120448175e62e796.jpg"
		}, {
			"id": 857705,
			"image": "https://media.rawg.io/media/screenshots/ca9/ca9268fa69daac4f902679b8c6b7fbe6.jpg"
		}, {
			"id": 857706,
			"image": "https://media.rawg.io/media/screenshots/b5f/b5f3e35952800c2bcf33463f708f1588.jpg"
		}, {
			"id": 857707,
			"image": "https://media.rawg.io/media/screenshots/e5c/e5c9dbe04c712780e94c4225b4491bad.jpg"
		}, {
			"id": 857708,
			"image": "https://media.rawg.io/media/screenshots/a64/a647aba43c3e589efdb6aafae1c7bb6f.jpg"
		}, {
			"id": 857709,
			"image": "https://media.rawg.io/media/screenshots/4e1/4e1fcc7dc593af145e04542a09456bc2.jpg"
		}, {
			"id": 857710,
			"image": "https://media.rawg.io/media/screenshots/d45/d45b7c3a59f71361120448175e62e796.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 40,
			"name": "Casual",
			"slug": "casual"
		}, {
			"id": 51,
			"name": "Indie",
			"slug": "indie"
		}]
	}, {
		"slug": "just-hero",
		"name": "Just Hero",
		"playtime": 4,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}],
		"released": "2016-09-28",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/8ce/8ce64d1f33e7bacc09ab4f7c517326e4.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [{
			"id": 1,
			"title": "skip",
			"count": 3,
			"percent": 75.0
		}, {
			"id": 3,
			"title": "meh",
			"count": 1,
			"percent": 25.0
		}],
		"ratings_count": 4,
		"reviews_text_count": 0,
		"added": 200,
		"added_by_status": {
			"yet": 3,
			"owned": 195,
			"dropped": 2
		},
		"metacritic": null,
		"suggestions_count": 150,
		"updated": "2019-09-17T08:21:42",
		"id": 18029,
		"score": "14.3787155",
		"clip": null,
		"tags": [{
			"id": 31,
			"name": "Singleplayer",
			"slug": "singleplayer",
			"language": "eng",
			"games_count": 96950,
			"image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
		}, {
			"id": 40847,
			"name": "Steam Achievements",
			"slug": "steam-achievements",
			"language": "eng",
			"games_count": 20335,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 42398,
			"name": "Инди",
			"slug": "indi-2",
			"language": "rus",
			"games_count": 32737,
			"image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
		}, {
			"id": 7808,
			"name": "steam-trading-cards",
			"slug": "steam-trading-cards",
			"language": "eng",
			"games_count": 7604,
			"image_background": "https://media.rawg.io/media/games/55e/55ee6432ac2bf224610fa17e4c652107.jpg"
		}, {
			"id": 40836,
			"name": "Full controller support",
			"slug": "full-controller-support",
			"language": "eng",
			"games_count": 9571,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 42399,
			"name": "Казуальная игра",
			"slug": "kazualnaia-igra",
			"language": "rus",
			"games_count": 18329,
			"image_background": "https://media.rawg.io/media/games/6d3/6d33014a4ed48a19c30a77ead5a0f62e.jpg"
		}, {
			"id": 42463,
			"name": "Платформер",
			"slug": "platformer-2",
			"language": "rus",
			"games_count": 3185,
			"image_background": "https://media.rawg.io/media/games/d5a/d5a24f9f71315427fa6e966fdd98dfa6.jpg"
		}],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 4,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/8ce/8ce64d1f33e7bacc09ab4f7c517326e4.jpg"
		}, {
			"id": 167352,
			"image": "https://media.rawg.io/media/screenshots/247/2475e5878edd0dd036910f2e67f18ce7.jpg"
		}, {
			"id": 167353,
			"image": "https://media.rawg.io/media/screenshots/c2d/c2dee6ff467568cc56597c2cb679d95a.jpg"
		}, {
			"id": 167354,
			"image": "https://media.rawg.io/media/screenshots/2e8/2e8ac25f7daf283f69d716f3ec117186.jpg"
		}, {
			"id": 167355,
			"image": "https://media.rawg.io/media/screenshots/c3e/c3ebbf4c465f5e57ac97e646abad07c8.jpg"
		}, {
			"id": 167356,
			"image": "https://media.rawg.io/media/screenshots/896/89662d8bd1805f1c03e6e60d842fe26b.jpg"
		}, {
			"id": 167357,
			"image": "https://media.rawg.io/media/screenshots/eb2/eb25e40bb0b5762c02707ca38c4e6cb9.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}],
		"genres": [{
			"id": 40,
			"name": "Casual",
			"slug": "casual"
		}, {
			"id": 51,
			"name": "Indie",
			"slug": "indie"
		}]
	}, {
		"slug": "just-deserts",
		"name": "Just Deserts",
		"playtime": 5,
		"platforms": [{
			"platform": {
				"id": 4,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 5,
				"name": "macOS",
				"slug": "macos"
			}
		}, {
			"platform": {
				"id": 6,
				"name": "Linux",
				"slug": "linux"
			}
		}],
		"stores": [{
			"store": {
				"id": 1,
				"name": "Steam",
				"slug": "steam"
			}
		}],
		"released": "2016-07-25",
		"tba": false,
		"background_image": "https://media.rawg.io/media/screenshots/1b7/1b73504b9f48bac2474a8e38b4b70df2.jpg",
		"rating": 0.0,
		"rating_top": 0,
		"ratings": [{
			"id": 1,
			"title": "skip",
			"count": 1,
			"percent": 100.0
		}],
		"ratings_count": 1,
		"reviews_text_count": 0,
		"added": 176,
		"added_by_status": {
			"yet": 13,
			"owned": 161,
			"dropped": 2
		},
		"metacritic": null,
		"suggestions_count": 272,
		"updated": "2019-09-17T09:26:11",
		"id": 16609,
		"score": "14.147197",
		"clip": null,
		"tags": [{
			"id": 31,
			"name": "Singleplayer",
			"slug": "singleplayer",
			"language": "eng",
			"games_count": 96950,
			"image_background": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
		}, {
			"id": 40847,
			"name": "Steam Achievements",
			"slug": "steam-achievements",
			"language": "eng",
			"games_count": 20335,
			"image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
		}, {
			"id": 42398,
			"name": "Инди",
			"slug": "indi-2",
			"language": "rus",
			"games_count": 32737,
			"image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
		}, {
			"id": 7808,
			"name": "steam-trading-cards",
			"slug": "steam-trading-cards",
			"language": "eng",
			"games_count": 7604,
			"image_background": "https://media.rawg.io/media/games/55e/55ee6432ac2bf224610fa17e4c652107.jpg"
		}, {
			"id": 42421,
			"name": "Стратегия",
			"slug": "strategiia",
			"language": "rus",
			"games_count": 9458,
			"image_background": "https://media.rawg.io/media/games/8bd/8bd24e3c15354a9555bb1437fe555a69.jpg"
		}, {
			"id": 42399,
			"name": "Казуальная игра",
			"slug": "kazualnaia-igra",
			"language": "rus",
			"games_count": 18329,
			"image_background": "https://media.rawg.io/media/games/6d3/6d33014a4ed48a19c30a77ead5a0f62e.jpg"
		}, {
			"id": 32,
			"name": "Sci-fi",
			"slug": "sci-fi",
			"language": "eng",
			"games_count": 8780,
			"image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
		}, {
			"id": 42423,
			"name": "Научная фантастика",
			"slug": "nauchnaia-fantastika",
			"language": "rus",
			"games_count": 2917,
			"image_background": "https://media.rawg.io/media/games/ebd/ebdbb7eb52bd58b0e7fa4538d9757b60.jpg"
		}, {
			"id": 16,
			"name": "Horror",
			"slug": "horror",
			"language": "eng",
			"games_count": 18297,
			"image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
		}, {
			"id": 42413,
			"name": "Симулятор",
			"slug": "simuliator",
			"language": "rus",
			"games_count": 9425,
			"image_background": "https://media.rawg.io/media/games/1a1/1a17e9b6286edb7e1f1e510110ccb0c0.jpg"
		}, {
			"id": 42406,
			"name": "Нагота",
			"slug": "nagota",
			"language": "rus",
			"games_count": 2083,
			"image_background": "https://media.rawg.io/media/games/8ca/8ca40b562a755d6a0e30d48e6c74b178.jpg"
		}, {
			"id": 134,
			"name": "Anime",
			"slug": "anime",
			"language": "eng",
			"games_count": 5229,
			"image_background": "https://media.rawg.io/media/games/ca1/ca16da30f86d8f4d36261de45fb35430.jpg"
		}, {
			"id": 42424,
			"name": "Пошаговая",
			"slug": "poshagovaia",
			"language": "rus",
			"games_count": 1374,
			"image_background": "https://media.rawg.io/media/screenshots/bf7/bf71c819eace914e6c42ae3ecb667308.jpg"
		}, {
			"id": 44,
			"name": "Nudity",
			"slug": "nudity",
			"language": "eng",
			"games_count": 2276,
			"image_background": "https://media.rawg.io/media/games/c81/c812e158129e00c9b0f096ae8a0bb7d6.jpg"
		}, {
			"id": 42407,
			"name": "Аниме",
			"slug": "anime-2",
			"language": "rus",
			"games_count": 3164,
			"image_background": "https://media.rawg.io/media/games/556/556157feed9ee1f55f2b12b2973e30a3.jpg"
		}, {
			"id": 102,
			"name": "Turn-Based",
			"slug": "turn-based",
			"language": "eng",
			"games_count": 3271,
			"image_background": "https://media.rawg.io/media/screenshots/bf7/bf71c819eace914e6c42ae3ecb667308.jpg"
		}, {
			"id": 42586,
			"name": "Милая",
			"slug": "milaia",
			"language": "rus",
			"games_count": 2499,
			"image_background": "https://media.rawg.io/media/games/d03/d030347839f74454afcd1008248b08ae.jpg"
		}, {
			"id": 88,
			"name": "Cute",
			"slug": "cute",
			"language": "eng",
			"games_count": 12355,
			"image_background": "https://media.rawg.io/media/games/718/71891d2484a592d871e91dc826707e1c.jpg"
		}, {
			"id": 172,
			"name": "Aliens",
			"slug": "aliens",
			"language": "eng",
			"games_count": 3772,
			"image_background": "https://media.rawg.io/media/games/daa/daaee07fcb40744d90cf8142f94a241f.jpg"
		}, {
			"id": 42431,
			"name": "Военные действия",
			"slug": "voennye-deistviia",
			"language": "rus",
			"games_count": 515,
			"image_background": "https://media.rawg.io/media/games/8bd/8bd24e3c15354a9555bb1437fe555a69.jpg"
		}, {
			"id": 42485,
			"name": "Инопланетяне",
			"slug": "inoplanetiane",
			"language": "rus",
			"games_count": 446,
			"image_background": "https://media.rawg.io/media/games/f54/f54e9fb2f4aac37810ea1a69a3e4480a.jpg"
		}, {
			"id": 81,
			"name": "Military",
			"slug": "military",
			"language": "eng",
			"games_count": 499,
			"image_background": "https://media.rawg.io/media/games/998/9980c4296f311d8bcc5b451ca51e4fe1.jpg"
		}, {
			"id": 42405,
			"name": "Сексуальный контент",
			"slug": "seksualnyi-kontent",
			"language": "rus",
			"games_count": 1866,
			"image_background": "https://media.rawg.io/media/games/fbb/fbbd9fe21317bde9134114e2b1306069.jpg"
		}, {
			"id": 42508,
			"name": "Нелинейность",
			"slug": "nelineinost",
			"language": "rus",
			"games_count": 814,
			"image_background": "https://media.rawg.io/media/games/8b9/8b9e77be7f0f7941b11ae4b21ca2db43.jpg"
		}, {
			"id": 42393,
			"name": "Визуальная новелла",
			"slug": "vizualnaia-novella",
			"language": "rus",
			"games_count": 2094,
			"image_background": "https://media.rawg.io/media/screenshots/fd4/fd4da6198e718001cd922f13b2e4d5bf.jpeg"
		}, {
			"id": 90,
			"name": "Visual Novel",
			"slug": "visual-novel",
			"language": "eng",
			"games_count": 1729,
			"image_background": "https://media.rawg.io/media/games/b2c/b2c9c6115114c8f7d461b5430e8a7d4a.jpg"
		}, {
			"id": 42568,
			"name": "Пошаговые сражения",
			"slug": "poshagovye-srazheniia",
			"language": "rus",
			"games_count": 696,
			"image_background": "https://media.rawg.io/media/screenshots/104/104603a5c863d6fa6be4d4bb1fed6db6.jpeg"
		}, {
			"id": 42631,
			"name": "Управление ресурсами",
			"slug": "upravlenie-resursami",
			"language": "rus",
			"games_count": 644,
			"image_background": "https://media.rawg.io/media/screenshots/88c/88c66f471e0b28d3f6711f162ef0848e_IOHyhbU.jpg"
		}, {
			"id": 175,
			"name": "Turn-Based Combat",
			"slug": "turn-based-combat",
			"language": "eng",
			"games_count": 1754,
			"image_background": "https://media.rawg.io/media/games/b2c/b2c9c6115114c8f7d461b5430e8a7d4a.jpg"
		}, {
			"id": 42408,
			"name": "Симулятор свиданий",
			"slug": "simuliator-svidanii",
			"language": "rus",
			"games_count": 587,
			"image_background": "https://media.rawg.io/media/games/81e/81e5cf3f433473af3a04888e3baceeba.jpg"
		}, {
			"id": 147,
			"name": "Resource Management",
			"slug": "resource-management",
			"language": "eng",
			"games_count": 486,
			"image_background": "https://media.rawg.io/media/games/7a0/7a0b4801b4ec1a8ed03cf07cfedcaa77.jpg"
		}, {
			"id": 160,
			"name": "Dating Sim",
			"slug": "dating-sim",
			"language": "eng",
			"games_count": 2026,
			"image_background": "https://media.rawg.io/media/screenshots/824/824055e458ec4deb654a3d1d57867e98.jpg"
		}],
		"esrb_rating": null,
		"user_game": null,
		"reviews_count": 1,
		"community_rating": 0,
		"saturated_color": "0f0f0f",
		"dominant_color": "0f0f0f",
		"short_screenshots": [{
			"id": -1,
			"image": "https://media.rawg.io/media/screenshots/1b7/1b73504b9f48bac2474a8e38b4b70df2.jpg"
		}, {
			"id": 149337,
			"image": "https://media.rawg.io/media/screenshots/7b8/7b891b29d50fc74b1a7d0c8bfc50dd56.jpg"
		}, {
			"id": 149338,
			"image": "https://media.rawg.io/media/screenshots/b8f/b8f6e9a9e96ca79f6245ac3a381a4232.jpg"
		}, {
			"id": 149339,
			"image": "https://media.rawg.io/media/screenshots/c97/c976f7cafc4fc303bb7c647577930e67.jpg"
		}, {
			"id": 149340,
			"image": "https://media.rawg.io/media/screenshots/b9f/b9f20b21186d706a7e586644c117ac97.jpg"
		}, {
			"id": 149341,
			"image": "https://media.rawg.io/media/screenshots/b2a/b2ac311c13cab107784613483c5076bb.jpg"
		}, {
			"id": 149342,
			"image": "https://media.rawg.io/media/screenshots/529/5291f601f03692989aa2d796d18cc7bf.jpg"
		}],
		"parent_platforms": [{
			"platform": {
				"id": 1,
				"name": "PC",
				"slug": "pc"
			}
		}, {
			"platform": {
				"id": 5,
				"name": "Apple Macintosh",
				"slug": "mac"
			}
		}, {
			"platform": {
				"id": 6,
				"name": "Linux",
				"slug": "linux"
			}
		}],
		"genres": [{
			"id": 40,
			"name": "Casual",
			"slug": "casual"
		}, {
			"id": 10,
			"name": "Strategy",
			"slug": "strategy"
		}, {
			"id": 51,
			"name": "Indie",
			"slug": "indie"
		}, {
			"id": 14,
			"name": "Simulation",
			"slug": "simulation"
		}]
	}],
	"user_platforms": false
}
 */