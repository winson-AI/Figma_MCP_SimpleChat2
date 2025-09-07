package com.example.simplechat2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import simplechat2.composeapp.generated.resources.*

@Composable
@Preview
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Status Bar
        StatusBar()

        // Top Navigation Bar
        TopNavigationBar()

        // Messages Section
        MessagesSection()

        // Send Message Input
        SendMessageInput()

        // Home Indicator
        HomeIndicator()
    }
}

@Composable
fun StatusBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp)
            .background(Color.White)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "9:41",
            color = Color(0xFF090A0A),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            // Mobile Signal Icon
            Icon(
                painter = painterResource(Res.drawable.ic_mobile_signal),
                contentDescription = "Mobile Signal",
                modifier = Modifier.size(18.dp),
                tint = Color(0xFF090A0A)
            )

            // WiFi Icon
            Icon(
                painter = painterResource(Res.drawable.ic_wifi),
                contentDescription = "WiFi",
                modifier = Modifier.size(15.272.dp),
                tint = Color(0xFF090A0A)
            )

            // Battery Icons
            Box(modifier = Modifier.size(26.978.dp, 13.dp)) {
                Icon(
                    painter = painterResource(Res.drawable.ic_battery_outline),
                    contentDescription = "Battery Outline",
                    modifier = Modifier.size(25.dp, 13.dp),
                    tint = Color(0xFF090A0A)
                )
                Icon(
                    painter = painterResource(Res.drawable.ic_battery_fill),
                    contentDescription = "Battery Fill",
                    modifier = Modifier.size(20.2.dp, 8.33.dp),
                    tint = Color(0xFF090A0A)
                )
                Icon(
                    painter = painterResource(Res.drawable.ic_battery_terminal),
                    contentDescription = "Battery Terminal",
                    modifier = Modifier.size(1.328.dp, 1.dp),
                    tint = Color(0xFF090A0A)
                )
            }
        }
    }
}

@Composable
fun TopNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp)
            .padding(horizontal = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Hamburger Menu Button
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .background(Color.White, RoundedCornerShape(50))
            ) {
                Icon(
                    painter = painterResource(Res.drawable.ic_hamburger_menu),
                    contentDescription = "Menu",
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.Center),
                    tint = Color(0xFF72777A)
                )
            }

            // FitBot Info
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Bot Avatar
                Box(
                    modifier = Modifier
                        .size(44.dp)
                        .background(Color.White, RoundedCornerShape(50))
                ) {
                    Icon(
                        painter = painterResource(Res.drawable.ic_fitbot_avatar),
                        contentDescription = "FitBot Avatar",
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.Center),
                        tint = Color.Unspecified
                    )
                }

                // Name and Status
                Column {
                    Text(
                        text = "FitBot",
                        color = Color(0xFF202325),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .background(Color(0xFF7DDE86), RoundedCornerShape(50))
                        )
                        Text(
                            text = "Always active",
                            color = Color(0xFF72777A),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }
        }

        // Menu Meatballs Button
        Box(
            modifier = Modifier
                .size(44.dp)
                .background(Color.White, RoundedCornerShape(50))
        ) {
            Icon(
                painter = painterResource(Res.drawable.ic_menu_meatballs),
                contentDescription = "Menu",
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.Center),
                tint = Color(0xFF72777A)
            )
        }
    }
}

@Composable
fun MessagesSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 32.dp)
    ) {
        // Bot Message 1
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Timestamp
            Text(
                text = "Wed 8:21 AM",
                color = Color(0xFF72777A),
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            // Message with avatar
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Bot Avatar
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(Color.White, RoundedCornerShape(50))
                ) {
                    Icon(
                        painter = painterResource(Res.drawable.ic_fitbot_avatar),
                        contentDescription = "Bot Avatar",
                        modifier = Modifier
                            .size(16.dp)
                            .align(Alignment.Center),
                        tint = Color.Unspecified
                    )
                }

                // Message Bubble
                Box(
                    modifier = Modifier
                        .background(Color(0xFFF2F4F5), RoundedCornerShape(24.dp))
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Hello, I'm FitBot! 👋 I'm your personal sport assistant. How can I help you?",
                        color = Color(0xFF303437),
                        fontSize = 16.sp,
                        lineHeight = 24.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Option Buttons
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF2F8FF),
                    contentColor = Color(0xFF006BE5)
                ),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Book me a visit in a gym",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(vertical = 2.dp)
                )
            }

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF2F8FF),
                    contentColor = Color(0xFF006BE5)
                ),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Show me other sports facilities around",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(vertical = 2.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // User Message
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 80.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(Color(0xFF0070F0), RoundedCornerShape(24.dp))
                    .align(Alignment.CenterEnd)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Show me other options",
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Bot Message 2
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Bot Avatar
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(Color.White, RoundedCornerShape(50))
            ) {
                Icon(
                    painter = painterResource(Res.drawable.ic_fitbot_avatar),
                    contentDescription = "Bot Avatar",
                    modifier = Modifier
                        .size(16.dp)
                        .align(Alignment.Center),
                    tint = Color.Unspecified
                )
            }

            // Message Bubble
            Box(
                modifier = Modifier
                    .background(Color(0xFFF2F4F5), RoundedCornerShape(24.dp))
                    .padding(16.dp)
            ) {
                Text(
                    text = "Ok, how about these?",
                    color = Color(0xFF303437),
                    fontSize = 16.sp,
                    lineHeight = 24.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Gym Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF2F8FF)
            ),
            shape = RoundedCornerShape(24.dp)
        ) {
                Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "BodyWorks on Nadwiślańska 12 street",
                    color = Color(0xFF006BE5),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Right
                )

                // Location and Price Info
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "250 meters",
                        color = Color(0xFF303437),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Box(
                        modifier = Modifier
                            .size(4.dp)
                            .background(Color(0xFF72777A), RoundedCornerShape(50))
                    )
                    Text(
                        text = "30 zł/one entrance all day",
                        color = Color(0xFF303437),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                }

                // Facility Icons
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // Gym
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier
                            .background(Color.White, RoundedCornerShape(16.dp))
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text(
                            text = "Gym️",
                            color = Color(0xFF72777A),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Icon(
                            painter = painterResource(Res.drawable.ic_dumbbell),
                            contentDescription = "Dumbbell",
                            modifier = Modifier.size(20.dp),
                            tint = Color.Unspecified
                        )
                    }

                    // SPA
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier
                            .background(Color.White, RoundedCornerShape(16.dp))
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text(
                            text = "SPA",
                            color = Color(0xFF72777A),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Icon(
                            painter = painterResource(Res.drawable.ic_spa),
                            contentDescription = "SPA",
                            modifier = Modifier.size(20.dp),
                            tint = Color.Unspecified
                        )
                    }

                    // Pool
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier
                            .background(Color.White, RoundedCornerShape(16.dp))
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text(
                            text = "Pool",
                            color = Color(0xFF72777A),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Icon(
                            painter = painterResource(Res.drawable.ic_pool),
                            contentDescription = "Pool",
                            modifier = Modifier.size(20.dp),
                            tint = Color.Unspecified
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SendMessageInput() {
    // Send a Message Prompt - Main container
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(108.dp)
            .background(Color.White)
    ) {
        // Send Message Input - Inner container
        Row(
            modifier = Modifier
                .padding(horizontal = 24.dp, vertical = 32.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Input Field Container
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(44.dp)
            ) {
                // Input field with border
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(44.dp)
                        .background(Color.White, RoundedCornerShape(48.dp))
                        .border(1.5.dp, Color(0xFF979C9E), RoundedCornerShape(48.dp))
                        .padding(horizontal = 20.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Type a message...",
                            color = Color(0xFF72777A),
                            fontSize = 16.sp
                        )
                        Icon(
                            painter = painterResource(Res.drawable.ic_microphone),
                            contentDescription = "Microphone",
                            modifier = Modifier.size(24.dp),
                            tint = Color(0xFF72777A)
                        )
                    }
                }
            }

            // Send Button - Categories Icon Button
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .background(Color(0xFF303437), RoundedCornerShape(50))
            ) {
                Icon(
                    painter = painterResource(Res.drawable.ic_send_arrow),
                    contentDescription = "Send",
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.Center),
                    tint = Color(0xFFF2F4F5)
                )
            }
        }
    }
}

@Composable
fun HomeIndicator() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(34.dp)
            .background(Color.White),
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier
                .width(148.dp)
                .height(5.dp)
                .background(Color.Black.copy(alpha = 0.2f), RoundedCornerShape(2.5.dp))
                .padding(top = 21.dp)
        )
    }
}