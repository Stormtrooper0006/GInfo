package com.dicoding.picodiploma.ginfo;

import java.util.ArrayList;

public class GamesData {
    private static String[] gameNames = {
            "Assassin's Creed Odyssey",
            "Call of Duty®: WWII",
            "Cyberpunk 2077",
            "Death Stranding",
            "Dishonored 2",
            "Fallout 4",
            "METAL GEAR SOLID V THE PHANTOM PAIN",
            "Red Dead Redemption 2",
            "Sekiro™ Shadows Die Twice",
            "The Witcher® 3: Wild Hunt"
    };

    private static String[] gameGeneral = {
            "Title: Assassin's Creed® Odyssey\n" +
                    "Genre: Action, Adventure, RPG\n" +
                    "Developer: Ubisoft Quebec, Ubisoft Montreal, Ubisoft Bucharest, Ubisoft Singapore, Ubisoft Montpellier, Ubisoft Kiev, Ubisoft Shanghai\n" +
                    "Publisher: Ubisoft\n" +
                    "Franchise: Assassin's Creed  \n" +
                    "Release Date: 6 October 2018",
            "Title: Call of Duty®: WWII\n" +
                    "Genre: Action\n" +
                    "Developer:  Sledgehammer Games, Raven Software\n" +
                    "Publisher: Activision\n" +
                    "Release Date: 2 November 2017",
            "Title: Cyberpunk 2077\n" +
                    "Genre: RPG\n" +
                    "Developer: CD PROJEKT RED\n" +
                    "Publisher: CD PROJEKT RED\n" +
                    "Release Date: 16 April 2020",
            "Title: Death Stranding\n" +
                    "Genre: Action, Adventure\n" +
                    "Developer:  Kojima Productions\n" +
                    "Publisher: 505 Games\n" +
                    "Release Date: December 2019",
            "Title: Dishonored 2\n" +
                    "Genre: Action\n" +
                    "Developer: Arkane Studios\n" +
                    "Publisher: Bethesda Softworks\n" +
                    "Release Date: 11 November 2016",
            "Title: Fallout 4\n" +
                    "Genre: RPG\n" +
                    "Developer: Bethesda Bridge Studios\n" +
                    "Publisher: Bethesda Softworks\n" +
                    "Franchise: Fallout\n" +
                    "Release Date: 10 november 2015",
            "Title: METAL GEAR SOLID V THE PHANTOM PAIN\n" +
                    "Genre: Action, Adventure\n" +
                    "Developer:  Konami Digital Entertainment\n" +
                    "Publisher:  Konami Digital Entertainment\n" +
                    "Release Date: 1 September 2015",
            "Title: Red Dead Redemption 2\n" +
                    "Genre: Action, Adventure\n" +
                    "Developer:  Rockstar Games\n" +
                    "Publisher: Rockstar Games\n" +
                    "Release Date: 6 December 2019",
            "Title: Sekiro™ Shadows Die Twice\n" +
                    "Genre: Action, Adventure\n" +
                    "Developer:  FromSoftware\n" +
                    "Publisher:  Activision (Excluding Japan and Asia), FromSoftware (Japan), CubeGame (Asia)\n" +
                    "Release Date: 22 March 2019",
            "Title: The Witcher® 3: Wild Hunt\n" +
                    "Genre: RPG\n" +
                    "Developer: CD PROJEKT RED\n" +
                    "Publisher: CD PROJEKT RED\n" +
                    "Release Date: 18 May 2015"
    };

    private static String[] gameAbout = {
            "Choose your fate in Assassin's Creed® Odyssey.\n" +
                    "From outcast to living legend, embark on an odyssey to uncover the secrets of your past and change the fate of Ancient Greece.\n" +
                    "\n" +
                    "TRAVEL TO ANCIENT GREECE\n" +
                    "From lush vibrant forests to volcanic islands and bustling cities, start a journey of exploration and encounters in a war torn world shaped by gods and men.\n" +
                    "\n" +
                    "FORGE YOUR LEGEND\n" +
                    "Your decisions will impact how your odyssey unfolds. Play through multiple endings thanks to the new dialogue system and the choices you make. Customize your gear, ship, and special abilities to become a legend.\n" +
                    "\n" +
                    "FIGHT ON A NEW SCALE\n" +
                    "Demonstrate your warrior's abilities in large scale epic battles between Athens and Sparta featuring hundreds of soldiers, or ram and cleave your way through entire fleets in naval battles across the Aegean Sea.\n" +
                    "\n" +
                    "GAZE IN WONDER\n" +
                    "Experience the action in a whole new light with Tobii Eye Tracking. The Extended View feature gives you a broader perspective of the environment, and the Dynamic Light and Sun Effects immerse you in the sandy dunes according to where you set your sights. Tagging, aiming and locking on your targets becomes a lot more natural when you can do it by looking at them. Let your vision lead the way and enhance your gameplay.\n" +
                    "Visit the Tobii website to check the list of compatible devices.\n" +
                    "\n" +
                    "\n" +
                    "MATURE CONTENT DESCRIPTION\n" +
                    "The developers describe the content like this:\n" +
                    "This is an action-adventure game in which players assume the role of Alexios or Kassandra, mercenaries on a quest for vengeance. As players explore an open-world environment in Ancient Greece, they interact with characters, infiltrate enemy bases and strongholds, and kill human enemies. Players use swords, spears, and bows to kill enemy soldiers and bandits in melee-style combat. Players also use stealth attacks (e.g., knife stabbing) to dispatch enemies discreetly. Large blood-splatter effects occur as enemies are killed. A handful of cutscenes depict more intense acts of violence and/or gore: characters stabbed through the head/neck with bladed weapons; young characters thrown off a cliff; a man mauled by a mob as his arm gets thrown into the air. Some environments depict severed limbs and dismembered corpses on the ground. The game contains instances of sexual material: characters kissing and caressing before the screen fades to black (sex is implied though never shown); dialogue referencing sex and prostitution (e.g., “Anything goes in this sex andron”; “That is love, this is commerce. What are you into?”); a character hearing sexual moaning sounds behind a door. The words “f**k” and “sh*t” are heard in the game.",
            "Call of Duty® returns to its roots with Call of Duty®: WWII - a breathtaking experience that redefines World War II for a new gaming generation. Land in Normandy on D-Day and battle across Europe through iconic locations in history’s most monumental war. Experience classic Call of Duty combat, the bonds of camaraderie, and the unforgiving nature of war against a global power throwing the world into tyranny.\n" +
                    "Call of Duty®: WWII creates the definitive World War II next generation experience across three different game modes: Campaign, Multiplayer, and Co-Operative. Featuring stunning visuals, the Campaign transports players to the European theater as they engage in an all-new Call of Duty® story set in iconic World War II battles. Multiplayer marks a return to original, boots-on-the ground Call of Duty gameplay. Authentic weapons and traditional run-and-gun action immerse you in a vast array of World War II-themed locations. The Co-Operative mode unleashes a new and original story in a standalone game experience full of unexpected, adrenaline-pumping moments.\n" +
                    "\n" +
                    "MATURE CONTENT DESCRIPTION\n" +
                    "The developers describe the content like this:\n" +
                    "This Game may contain content not appropriate for all ages, or may not be appropriate for viewing at work: Frequent Violence or Gore, General Mature Content",
            "Cyberpunk 2077 is an open-world, action-adventure story set in Night City, a megalopolis\n" +
                    "obsessed with power, glamour and body modification. You play as V, a mercenary outlaw going after a one-of-a-kind implant that is the key to immortality. You can customize your character’s cyberware, skillset and playstyle, and explore a vast city where the choices you make shape the story and the world around you.\n" +
                    "Become a cyberpunk, an urban mercenary equipped with cybernetic enhancements and build\n" +
                    "your legend on the streets of Night City.\n" +
                    "Enter the massive open world of Night City, a place that sets new standards in terms of visuals, complexity and depth.\n" +
                    "Take the riskiest job of your life and go after a prototype implant that is the key to immortality.\n" +
                    "\n" +
                    "\n" +
                    "MATURE CONTENT DESCRIPTION\n" +
                    "The developers describe the content like this:\n" +
                    "This Game may contain content not appropriate for all ages, or may not be appropriate for viewing at work: Nudity or Sexual Content, General Mature Content",
            "From legendary game creator Hideo Kojima comes an all-new, genre-defying experience.\n" +
                    "\n" +
                    "Sam Bridges must brave a world utterly transformed by the Death Stranding. Carrying the disconnected remnants of our future in his hands, he embarks on a journey to reconnect the shattered world one step at a time.\n" +
                    "\n" +
                    "Starring Norman Reedus, Mads Mikkelsen, Léa Seydoux, and Lindsay Wagner.\n",
            "Game Description\n" +
                    "Reprise your role as a supernatural assassin in Dishonored 2.\n" +
                    "Praised by PC Gamer as “brilliant”, IGN as “amazing” and “a super sequel, IGN as “amazing” and “a superb sequel”, declared a “masterpiece” by Eurogamer, and hailed “a must-play revenge tale among the best in its class” by Game Informer, Dishonored 2 is the follow up to Arkane Studio's first-person action blockbuster and winner of more than 100 'Game of the Year' awards, Dishonored.\n" +
                    "\n" +
                    "Play your way in a world where mysticism and industry collide. Will you choose to play as Empress Emily Kaldwin or the royal protector, Corvo Attano? Will you make your way through the game unseen, make full use of its brutal combat system, or use a blend of both? How will you combine your character's unique set of powers, weapons and gadgets to eliminate your enemies? The story responds to your choices, leading to intriguing outcomes, as you play through each of the game's hand-crafted missions.\n" +
                    "Story\n" +
                    "Dishonored 2 is set 15 years after the Lord Regent has been vanquished and the dreaded Rat Plague has passed into history. An otherworldly usurper has seized Empress Emily Kaldwin’s throne, leaving the fate of the Isles hanging in the balance. As Emily or Corvo, travel beyond the legendary streets of Dunwall to Karnaca, the once-dazzling coastal city that holds the keys to restoring Emily to power. Armed with the Mark of the Outsider and powerful new abilities, track down your enemies and take back what’s rightfully yours.\n" +
                    "Key Features :\n" +
                    "The Assassins\n" +
                    "As fully voiced characters, Emily Kaldwin and Corvo Attano now bring their own perspectives and emotional responses to the world and story. Use each character’s set of powers, gadgets and uniquely-tuned weapons in creative ways as you explore the world – whether you fight your way through the city streets or sneak across the rooftops - and which enemies you decide to eliminate or spare.\n" +
                    "Supernatural Powers\n" +
                    "Advanced bonecharm crafting and all-new upgrade trees allow you to customize your powers in vastly different ways. Become a living shadow to silently stalk your targets, link enemies so they share a common fate, or mesmerize your foes and dominate their minds. Choose from nearly infinite combinations of violence, nonlethal combat, powers and weapons to accomplish your objectives.\n" +
                    "Imaginative World\n" +
                    "From the grimy, rat-infested streets of Dunwall to the lush, exotic coasts of a decaying Karnaca, immerse yourself in stylized locales created by Arkane’s premiere art and narrative teams. The world is a character in its own right, rich with story, architecture and eclectic characters. It is also punctuated by signature mission locations, such as the Dust District, ravaged by dust storms and warring factions, and a madman’s mansion made of shifting walls, deadly traps and clockwork soldiers.\n" +
                    "The Void Engine\n" +
                    "Dishonored 2 is beautifully brought to life with the new Void Engine, a leap forward in rendering technology, built from id Tech and highly-customized by Arkane Studios. Designed to support world-class art direction and take full advantage of the powerful hardware this generation has to offer, the Void Engine allows for significant advances to all game systems, including responsive stealth and combat Artificial Intelligence, lighting and graphical rendering, impressively dense urban environments, and story presentation.",
            "Bethesda Game Studios, the award-winning creators of Fallout 3 and The Elder Scrolls V: Skyrim, welcome you to the world of Fallout 4 – their most ambitious game ever, and the next generation of open-world gaming.\n" +
                    "\n" +
                    "As the sole survivor of Vault 111, you enter a world destroyed by nuclear war. Every second is a fight for survival, and every choice is yours. Only you can rebuild and determine the fate of the Wasteland. Welcome home.\n" +
                    "Key Features:\n" +
                    "Freedom and Liberty!\n" +
                    "Do whatever you want in a massive open world with hundreds of locations, characters, and quests. Join multiple factions vying for power or go it alone, the choices are all yours.\n" +
                    "\n" +
                    "You’re S.P.E.C.I.A.L!\n" +
                    "Be whoever you want with the S.P.E.C.I.A.L. character system. From a Power Armored soldier to the charismatic smooth talker, you can choose from hundreds of Perks and develop your own playstyle.\n" +
                    "\n" +
                    "Super Deluxe Pixels!\n" +
                    "An all-new next generation graphics and lighting engine brings to life the world of Fallout like never before. From the blasted forests of the Commonwealth to the ruins of Boston, every location is packed with dynamic detail.\n" +
                    "\n" +
                    "Violence and V.A.T.S.!\n" +
                    "Intense first or third person combat can also be slowed down with the new dynamic Vault-Tec Assisted Targeting System (V.A.T.S) that lets you choose your attacks and enjoy cinematic carnage.\n" +
                    "\n" +
                    "Collect and Build!\n" +
                    "Collect, upgrade, and build thousands of items in the most advanced crafting system ever. Weapons, armor, chemicals, and food are just the beginning - you can even build and manage entire settlements.",
            "Konami Digital Entertainment continues forth the ‘METAL GEAR SOLID V Experience’ with the latest chapter, METAL GEAR SOLID V: The Phantom Pain. Ushering in a new era for the franchise with cutting-edge technology powered by the Fox Engine, MGSV: The Phantom Pain will provide players a first-rate gaming experience as they are offered tactical freedom to carry out open-world missions.\n" +
                    "\n" +
                    "Nine years after the events of MGSV: GROUND ZEROES and the fall of Mother Base, Snake a.k.a. Big Boss, awakens from a nine year coma. The year is 1984. The Cold War serves as the backdrop as nuclear weapons continue to shape a global crisis. Driven by revenge, Snake establishes a new private army and returns to the battlefield in pursuit of the shadow group, XOF.\n" +
                    "\n" +
                    "The METAL GEAR SOLID team continues to ambitiously explore mature themes such as the psychology of warfare and the atrocities that result from those that engage in its vicious cycle. One of the most anticipated games of the year with its open-world design, photorealistic visual fidelity and feature-rich game design, MGSV: The Phantom Pain will leave its mark as one of the hallmarks in the gaming industry for its cinematic storytelling, heavy themes, and immersive tactical gameplay.\n" +
                    "\n" +
                    "Key Features:\n" +
                    "- Open-World game design allowing players ultimate freedom on how to approach missions and overall game progression\n" +
                    "- Fox Engine delivers photorealistic graphics, thoughtful game design and true new-generation game production quality\n" +
                    "- Online connectivity that carries the experience beyond the consoles to other devices to augment the overall functionality and access to the game.",
            "Red Dead Redemption 2, the critically acclaimed open world epic from Rockstar Games and the highest rated game of the console generation, now enhanced for PC with new Story Mode content, visual upgrades and more.\n" +
                    "America, 1899. The end of the wild west era has begun. After a robbery goes badly wrong in the western town of Blackwater, Arthur Morgan and the Van der Linde gang are forced to flee. With federal agents and the best bounty hunters in the nation massing on their heels, the gang must rob, steal and fight their way across the rugged heartland of America in order to survive. As deepening internal divisions threaten to tear the gang apart, Arthur must make a choice between his own ideals and loyalty to the gang who raised him.\n" +
                    "\n" +
                    "With all new graphical and technical enhancements for deeper immersion, Red Dead Redemption 2 for PC takes full advantage of the power of the PC to bring every corner of this massive, rich and detailed world to life including increased draw distances; higher quality global illumination and ambient occlusion for improved day and night lighting; improved reflections and deeper, higher resolution shadows at all distances; tessellated tree textures and improved grass and fur textures for added realism in every plant and animal.\n" +
                    "\n" +
                    "Red Dead Redemption 2 for PC also offers HDR support, the ability to run high-end display setups with 4K resolution and beyond, multi-monitor configurations, widescreen configurations, faster frame rates and more.\n" +
                    "\n" +
                    "Red Dead Redemption 2 for PC also includes additional Story Mode content including Bounty Hunting Missions, Gang Hideouts, Weapons and more; plus free access to the shared living world of Red Dead Online featuring all previously released improvements and the latest content for the complete Online experience including Frontier Pursuits and the specialist Roles of The Bounty Hunter, Trader and Collector, and much more.\n" +
                    "\n" +
                    "Red Dead Redemption 2 for PC is the ultimate way to experience one of the most critically acclaimed games of all time, winner of over 175 Game of the Year Awards and recipient of over 250 perfect scores.\n" +
                    "\n" +
                    "MATURE CONTENT DESCRIPTION\n" +
                    "The developers describe the content like this:\n" +
                    "This Game may contain content not appropriate for all ages, or may not be appropriate for viewing at work: Frequent Violence or Gore, General Mature Content",
            "Game of the Year - The Game Awards 2019\n" +
                    "Game of the Year 2019 - GameSpot\n" +
                    "Best Action Game of 2019 - IGN\n" +
                    "Over 50 awards and nominations\n" +
                    "\n" +
                    "Carve your own clever path to vengeance in the critically acclaimed adventure from developer FromSoftware, creators of Bloodborne and the Dark Souls series.\n" +
                    "\n" +
                    "In Sekiro: Shadows Die Twice you are the \"one-armed wolf\", a disgraced and disfigured warrior rescued from the brink of death. Bound to protect a young lord who is the descendant of an ancient bloodline, you become the target of many vicious enemies, including the dangerous Ashina clan. When the young lord is captured, nothing will stop you on a perilous quest to regain your honor, not even death itself.\n" +
                    "\n" +
                    "Explore late 1500s Sengoku Japan, a brutal period of constant life and death conflict, as you come face to face with larger than life foes in a dark and twisted world. Unleash an arsenal of deadly prosthetic tools and powerful ninja abilities while you blend stealth, vertical traversal, and visceral head to head combat in a bloody confrontation.\n" +
                    "\n" +
                    "Take Revenge. Restore your honor. Kill Ingeniously.\n" +
                    "\n" +
                    "\n" +
                    "MATURE CONTENT DESCRIPTION\n" +
                    "The developers describe the content like this:\n" +
                    "This Game may contain content not appropriate for all ages, or may not be appropriate for viewing at work: Frequent Violence or Gore, General Mature Content",
            "The Witcher: Wild Hunt is a story-driven open world RPG set in a visually stunning fantasy universe full of meaningful choices and impactful consequences. In The Witcher, you play as professional monster hunter Geralt of Rivia tasked with finding a child of prophecy in a vast open world rich with merchant cities, pirate islands, dangerous mountain passes, and forgotten caverns to explore.\n" +
                    "KEY FEATURES\n" +
                    "PLAY AS A HIGHLY TRAINED MONSTER SLAYER FOR HIRE\n" +
                    "Trained from early childhood and mutated to gain superhuman skills, strength and reflexes, witchers are a counterbalance to the monster-infested world in which they live.\n" +
                    "Gruesomely destroy foes as a professional monster hunter armed with a range of upgradeable weapons, mutating potions and combat magic.\n" +
                    "Hunt down a wide range of exotic monsters — from savage beasts prowling the mountain passes, to cunning supernatural predators lurking in the shadows of densely populated towns.\n" +
                    "Invest your rewards to upgrade your weaponry and buy custom armour, or spend them away in horse races, card games, fist fighting, and other pleasures the night brings.\n" +
                    "\n" +
                    "EXPLORE A MORALLY INDIFFERENT FANTASY OPEN WORLD\n" +
                    "Built for endless adventure, the massive open world of The Witcher sets new standards in terms of size, depth and complexity.\n" +
                    "Traverse a fantastical open world: explore forgotten ruins, caves and shipwrecks, trade with merchants and dwarven smiths in cities, and hunt across the open plains, mountains and seas.\n" +
                    "Deal with treasonous generals, devious witches and corrupt royalty to provide dark and dangerous services.\n" +
                    "Make choices that go beyond good & evil, and face their far-reaching consequences.\n" +
                    "\n" +
                    "CHASE DOWN THE CHILD OF PROPHECY\n" +
                    "Take on the most important contract to track down the child of prophecy, a key to save or destroy this world.\n" +
                    "In times of war, chase down the child of prophecy, a living weapon foretold by ancient elven legends.\n" +
                    "Struggle against ferocious rulers, spirits of the wilds and even a threat from beyond the veil – all hell-bent on controlling this world.\n" +
                    "Define your destiny in a world that may not be worth saving.\n" +
                    "\n" +
                    "FULLY REALIZED NEXT GENERATION\n" +
                    "Built exclusively for next generation hardware, the REDengine 3 renders the world of The Witcher visually nuanced and organic, a real true to life fantasy.\n" +
                    "Dynamic weather systems and day/night cycles affect how the citizens of the towns and the monsters of the wilds behave.\n" +
                    "Rich with storyline choices in both main and subplots, this grand open world is influenced by the player unlike ever before.\n" +
                    "\n" +
                    "The developers describe the content like this:\n" +
                    "This Game may contain content not appropriate for all ages, or may not be appropriate for viewing at work: Nudity or Sexual Content, General Mature Content"
    };

    private static String[] gameSystemRequirements = {
            "MINIMUM:\n" +
                    "OS: Windows 7 SP1, Windows 8.1, Windows 10 (64bit versions only)\n" +
                    "Processor: AMD FX 6300 @ 3.8 GHz, Ryzen 3 - 1200, Intel Core i5 2400 @ 3.1 GHz \n" +
                    "Memory: 8 GB RAM\n" +
                    "Graphics: AMD Radeon R9 285, NVIDIA GeForce GTX 660 (2GB VRAM with Shader Model 5.0)\n" +
                    "DirectX: Version 11\n" +
                    "Storage: 46+ GB available space\n" +
                    "Additional Notes: Video Preset: Lowest (720p)\n" +
                    "RECOMMENDED:\n" +
                    "OS: Windows 7 SP1, Windows 8.1, Windows 10 (64bit versions only)\n" +
                    "Processor: AMD FX-8350 @ 4.0 GHz, Ryzen 5 - 1400, Intel Core i7-3770 @ 3.5 GHz or better\n" +
                    "Memory: 8 GB RAM\n" +
                    "Graphics: AMD Radeon R9 290, NVIDIA GeForce GTX 970 (4GB VRAM with Shader Model 5.0) or better \n" +
                    "Storage: 46+ GB available space\n" +
                    "Additional Notes: Video Preset: High (1080p)",
            "MINIMUM:\n" +
                    "Requires a 64-bit processor and operating system\n" +
                    "OS: Windows 7 64-Bit or later\n" +
                    "Processor: CPU: Intel® Core™ i3 3225 3.3 GHz or AMD Ryzen™ 5 1400\n" +
                    "Memory: 8 GB RAM\n" +
                    "Graphics: NVIDIA® GeForce® GTX 660 @ 2 GB / GTX 1050 or ATI® Radeon™ HD 7850 @ 2GB / AMD RX 550\n" +
                    "DirectX: Version 11\n" +
                    "Network: Broadband Internet connection\n" +
                    "Storage: 90 GB available space\n" +
                    "Sound Card: DirectX Compatible\n" +
                    "RECOMMENDED:\n" +
                    "OS: Windows 7 SP1, Windows 8.1, Windows 10 (64bit versions only)\n" +
                    "Processor: Intel Core i5-2400 or AMD Ryzen R5 1600X\n" +
                    "Memory: 12 GB RAM\n" +
                    "Graphics: Nvidia GeForce GTX 970 / GTX 1060 @ 6GB or AMD Radeon R9 390 / AMD RX 580\n" +
                    "DirectX: Version 11\n" +
                    "Network: Broadband Internet connection\n" +
                    "Storage: 90 GB available space\n" +
                    "Sound Card: DirectX Compatible\n",
            "Still unknown",
            "Still unknown",
            "MINIMUM:\n" +
                    "Requires a 64-bit processor and operating system\n" +
                    "OS: Windows 7/8/10 (64-bit versions)\n" +
                    "Processor: Intel Core i5-2400/AMD FX-8320 or better\n" +
                    "Memory: 8 GB RAM\n" +
                    "Graphics: NVIDIA GTX 660 2GB/AMD Radeon HD 7970 3GB or better\n" +
                    "Storage: 60 GB available space\n" +
                    "RECOMMENDED:\n" +
                    "Requires a 64-bit processor and operating system\n" +
                    "OS: Windows 10 (64-bit versions)\n" +
                    "Processor: Intel Core i7-4770/AMD FX-8350 or better\n" +
                    "Memory: 16 GB RAM\n" +
                    "Graphics: NVIDIA GTX 1060 6GB/AMD Radeon RX 480 8GB or better\n" +
                    "Storage: 60 GB available space",
            "MINIMUM:\n" +
                    "Requires a 64-bit processor and operating system\n" +
                    "OS: Windows 7/8/10 (64-bit OS required)\n" +
                    "Processor: Intel Core i5-2300 2.8 GHz/AMD Phenom II X4 945 3.0 GHz or equivalent\n" +
                    "Memory: 8 GB RAM\n" +
                    "Graphics: NVIDIA GTX 550 Ti 2GB/AMD Radeon HD 7870 2GB or equivalent\n" +
                    "Storage: 30 GB available space\n" +
                    "RECOMMENDED:\n" +
                    "Requires a 64-bit processor and operating system\n" +
                    "OS: Windows 7/8/10 (64-bit OS required)\n" +
                    "Processor: Intel Core i7 4790 3.6 GHz/AMD FX-9590 4.7 GHz or equivalent\n" +
                    "Memory: 8 GB RAM\n" +
                    "Graphics: NVIDIA GTX 780 3GB/AMD Radeon R9 290X 4GB or equivalent\n" +
                    "Storage: 30 GB available space",
            "MINIMUM:\n" +
                    "OS: Windows 7x64, Windows 8x64, Windows 10x64 (64-bit OS Required)\n" +
                    "Processor: Intel Core i5-4460 (3.40 GHz) or better; Quad-core or better\n" +
                    "Memory: 4 GB RAM\n" +
                    "Graphics: NVIDIA GeForce GTX 650 (2GB) or better (DirectX 11 card Required)\n" +
                    "DirectX: Version 11\n" +
                    "Storage: 28 GB available space\n" +
                    "Sound Card: DirectX 9.0c compatible sound card\n" +
                    "RECOMMENDED:\n" +
                    "OS: Windows 7x64, Windows 8x64, Windows 10x64 (64-bit OS Required)\n" +
                    "Processor: Intel Core i7-4790 (3.60GHz) or better; Quad-core or better\n" +
                    "Memory: 8 GB RAM\n" +
                    "Graphics: NVIDIA GeForce GTX 760 (DirectX 11 graphic card required)\n" +
                    "DirectX: Version 11\n" +
                    "Storage: 28 GB available space\n" +
                    "Sound Card: DirectX 9.0c compatible sound card (Surround Sound 5.1)",
            "MINIMUM:\n" +
                    "Requires a 64-bit processor and operating system\n" +
                    "OS: Windows 7 - Service Pack 1 (6.1.7601)\n" +
                    "Processor: Intel® Core™ i5-2500K / AMD FX-6300\n" +
                    "Memory: 8 GB RAM\n" +
                    "Graphics: Nvidia GeForce GTX 770 2GB / AMD Radeon R9 280 3GB\n" +
                    "Network: Broadband Internet connection\n" +
                    "Storage: 150 GB available space\n" +
                    "Sound Card: Direct X Compatible\n" +
                    "RECOMMENDED:\n" +
                    "Requires a 64-bit processor and operating system\n" +
                    "OS: Windows 10 - April 2018 Update (v1803)\n" +
                    "Processor: Intel® Core™ i7-4770K / AMD Ryzen 5 1500X\n" +
                    "Memory: 12 GB RAM\n" +
                    "Graphics: Nvidia GeForce GTX 1060 6GB / AMD Radeon RX 480 4GB\n" +
                    "Network: Broadband Internet connection\n" +
                    "Storage: 150 GB available space\n" +
                    "Sound Card: Direct X Compatible",
            "MINIMUM:\n" +
                    "OS: Windows 7 64-bit | Windows 8 64-bit | Windows 10 64-bit\n" +
                    "Processor: Intel Core i3-2100 | AMD FX-6300\n" +
                    "Memory: 4 GB RAM\n" +
                    "Graphics: NVIDIA GeForce GTX 760 | AMD Radeon HD 7950\n" +
                    "DirectX: Version 11\n" +
                    "Network: Broadband Internet connection\n" +
                    "Storage: 25 GB available space\n" +
                    "Sound Card: DirectX 11 Compatible\n" +
                    "RECOMMENDED:\n" +
                    "OS: Windows 7 64-bit | Windows 8 64-bit | Windows 10 64-bit\n" +
                    "Processor: Intel Core i5-2500K | AMD Ryzen 5 1400\n" +
                    "Memory: 8 GB RAM\n" +
                    "Graphics: NVIDIA GeForce GTX 970 | AMD Radeon RX 570\n" +
                    "DirectX: Version 11\n" +
                    "Network: Broadband Internet connection\n" +
                    "Storage: 25 GB available space\n" +
                    "Sound Card: DirectX 11 Compatible\n",
            "MINIMUM:\n" +
                    "OS: 64-bit Windows 7, 64-bit Windows 8 (8.1) or 64-bit Windows 10\n" +
                    "Processor: Intel CPU Core i5-2500K 3.3GHz / AMD CPU Phenom II X4 940\n" +
                    "Memory: 6 GB RAM\n" +
                    "Graphics: Nvidia GPU GeForce GTX 660 / AMD GPU Radeon HD 7870\n" +
                    "Storage: 35 GB available space\n" +
                    "RECOMMENDED:\n" +
                    "OS: 64-bit Windows 7, 64-bit Windows 8 (8.1) or 64-bit Windows 10\n" +
                    "Processor: Intel CPU Core i7 3770 3.4 GHz / AMD CPU AMD FX-8350 4 GHz\n" +
                    "Memory: 8 GB RAM\n" +
                    "Graphics: Nvidia GPU GeForce GTX 770 / AMD GPU Radeon R9 290\n" +
                    "Storage: 35 GB available space"
    };

    private static String[] gameCopyright = {
            "© 2018 Ubisoft Entertainment. All Rights Reserved. Assassin’s Creed, Ubisoft, and the Ubisoft logo are trademarks of Ubisoft Entertainment in the U.S. and/or other countries.",
            "© 2017 Activision Publishing, Inc. ACTIVISION, CALL OF DUTY, and CALL OF DUTY WWII are trademarks of Activision Publishing, Inc. All other trademarks and trade names are the properties of their respective owners",
            null,
            "PC version published by 505 Games. ©2019 Sony Interactive Entertainment Inc. DEATH STRANDING is a trademark of Sony Interactive Entertainment LLC. Created and developed by Kojima Productions. All trademarks are the property of their respective owners. 505 Games and the 505 Games logo are registered trademarks of 505 Games S.P.A. Appearance in this game does not imply sponsorship or endorsement.",
            "© 2016 Bethesda Softworks LLC, a ZeniMax Media company. Developed in association with Arkane Studios. Dishonored, Arkane, Void Engine powered by id Tech, Bethesda, Bethesda Softworks, ZeniMax and related logos are registered trademarks or trademarks of ZeniMax Media Inc. in the U.S. and/or other countries. All Rights Reserved.",
            "© 2015 Bethesda Softworks LLC, a ZeniMax Media company. Bethesda, Bethesda Softworks, Bethesda Game Studios, ZeniMax and related logos are registered\n" +
                    "trademarks or trademarks of ZeniMax Media Inc. in the U.S. and/or other countries. Fallout, Vault Boy, and related logos are registered trademarks or trademarks of\n" +
                    "Bethesda Softworks LLC in the U.S. and/or other countries. All other trademarks or trade names are the property of their respective owners. All Rights Reserved.\n",
            "©2015 Konami Digital Entertainment",
            "Rockstar Games, Inc. ©2005-19. Rockstar Games, Red Dead Redemption, R*, Redemption, Red Dead, Dead Eye are marks/logos/copyrights of Take-Two Interactive. Dolby and the Double-D symbols are trademarks of Dolby Laboratories. The ratings icon is a trademark of the Entertainment Software Association. All other marks and trademarks are properties of their respective owners. All rights reserved.",
            "©2019 FromSoftware, Inc. All rights reserved. Published and distributed by Activision. ACTIVISION is a trademark of Activision Publishing Inc. All other trademarks and trade names are the properties of their respective owners.\n" +
                    "\n" +
                    "Bloodborne is a trademark of Sony Interactive Entertainment LLC. Dark Souls is a trademark of BANDAI NAMCO Entertainment Inc. Sony and Bandai Namco are not the publisher of SEKIRO: SHADOWS DIE TWICE. Activision has no affiliation with Bloodborne or Dark Souls.",
            "The Witcher® is a trademark of CD Projekt S. A. The Witcher game © CD Projekt S. A. All rights reserved. The Witcher game is based on a novel by Andrzej Sapkowski. All other copyrights and trademarks are the property of their respective owners"
    };

    private static int[] gamesPoster = {
            R.drawable.ac_odyssey,
            R.drawable.cod_ww2,
            R.drawable.cyberpunk2077,
            R.drawable.death_stranding,
            R.drawable.dishonored2,
            R.drawable.fallout4,
            R.drawable.mgs_v,
            R.drawable.rdr2,
            R.drawable.sekiro,
            R.drawable.the_witcher3
    };

    public static int[] gamesPhotos = {
            R.drawable.ac6,
            R.drawable.codww2_2,
            R.drawable.cyberpunk,
            R.drawable.death_stranding,
            R.drawable.dishonored2_,
            R.drawable.fallout4_,
            R.drawable.mgsv,
            R.drawable.rdr2_,
            R.drawable.sekiro_,
            R.drawable.witcher
    };

    static ArrayList<Bridge> getListData() {
        ArrayList<Bridge> list = new ArrayList<>();
        for (int position = 0; position < gameNames.length; position++) {
            Bridge bridge = new Bridge();
            bridge.setTitle(gameNames[position]);
            bridge.setGeneral(gameGeneral[position]);
            bridge.setDetail(gameAbout[position]);
            bridge.setSystemRequirements(gameSystemRequirements[position]);
            bridge.setCopyright(gameCopyright[position]);
            bridge.setPoster(gamesPoster[position]);
            bridge.setPhoto(gamesPhotos[position]);
            list.add(bridge);
        }
        return list;
    }
}
